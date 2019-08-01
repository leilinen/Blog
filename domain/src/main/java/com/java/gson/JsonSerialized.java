package com.java.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

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
        parsePersonJson(person);
    }
}
