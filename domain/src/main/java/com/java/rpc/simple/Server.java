package com.java.rpc.simple;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static boolean running = true;

    public static void main(String[] args) throws Exception {
        // 建立服务端socket
        ServerSocket ss = new ServerSocket(8888);

        // 不断监听，处理客户端请求
        while (running) {
            Socket socket = ss.accept();
            process(socket);
            socket.close();
        }
        ss.close();
    }

    private static void process(Socket socket) throws Exception {
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        DataInputStream dis = new DataInputStream(is);
        DataOutputStream dos = new DataOutputStream(os);

        Integer id = dis.readInt();

        IProductService service = new IProductServiceImpl();
        Product product = service.getProductById(id);

        dos.writeInt(id);
        dos.writeUTF(product.getName());

        dos.flush();

        dos.close();
        dis.close();
        os.close();
        is.close();

    }
}
