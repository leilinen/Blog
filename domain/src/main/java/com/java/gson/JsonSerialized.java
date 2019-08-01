package com.java.gson;

import com.google.gson.*;

public class JsonSerialized {


    private static String person = "{\n" +
            "        \"sex\": '男',\n" +
            "        \"hobby\":[\"baskte\",\"tennis\"],\n" +
            "        \"introduce\": {\n" +
            "            \"name\":\"tom\",\n" +
            "            \"age\":23\n" +
            "        }\n" +
            "    }";

    private static void parsePersonJson(String data) {
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(data);
        if (element.isJsonObject()) {
            JsonObject object = element.getAsJsonObject();

            String sex = object.get("sex").getAsString();

            JsonArray hobbies = object.get("hobby").getAsJsonArray();

            for (int i=0; i<hobbies.size(); i++) {
                String hobby = hobbies.get(i).getAsString();
                System.out.println("hobby: " + hobby);
            }

            JsonObject introduce = object.getAsJsonObject("introduce");
            String  name = introduce.get("name").getAsString();
            int age = introduce.get("age").getAsInt();
            System.out.println("name: " + name + "; age: " + age);
        }
    }

    public static void main(String[] args) {
        // parsePersonJson(person);

        String json1 = "{\"name\":\"tom\",\"salary\":2999}";
        Gson gson1 = new Gson();

        Iam i = gson1.fromJson(json1, Iam.class);
        System.out.println(i.toString());
    }
}

class Iam{
    private String name;
    private int age;
    private String address;
    private int salary;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", age: " + this.age + ", address: " + this.address + ", salary: " + this.salary;
    }
}