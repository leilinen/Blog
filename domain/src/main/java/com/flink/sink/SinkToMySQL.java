package com.flink.sink;

import com.bean.Student;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SinkToMySQL extends RichSinkFunction<Student> {

    private PreparedStatement ps;
    private Connection connection;


    @Override
    public void open(Configuration parameters) throws Exception {
        super.open(parameters);
        connection = getConnection();
        String sql = "insert into Student(id, name, password, age)" +
                "values (?, ?, ?, ?);";
        ps = this.connection.prepareStatement(sql);
    }

    @Override
    public void close() throws Exception {
        super.close();
        if (connection != null) {
            connection.close();
        }

        if (ps != null) {
            ps.close();
        }
    }

    // 每插入一条数据都要执行一次invoke
    public void invoke(Student value, Context context) throws Exception {
       ps.setInt(1, value.getId());
       ps.setString(2, value.getName());
       ps.setString(3, value.getPassword());
       ps.setInt(4, value.getAge());
       ps.executeUpdate();
    }

    private static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8\", \"root\", \"root123456\"");
        } catch (Exception e) {
            System.out.println("Mysql get connection has exception, msg = " + e.getMessage());
        }
        return con;
    }
}
