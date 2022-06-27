package com.java.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-05-09
 */
public class mapJsonArray {

    public void process(Object[] args) throws Exception {
        //获取第一个参数，需要解析的json数组
        JsonArray jsonArray = new JsonParser().parse(args[0].toString()).getAsJsonArray();
        //获取第二个参数，需要查找的key名称
        String keyname = args[1].toString();
        //获取第三个参数，key所对应的list。
        String keylist = args[2].toString();
        //获取第四哥参数，最终输出所对应的键名。
        String valname = args[3].toString();

        ArrayList<String> keylist2 = new ArrayList<>(Arrays.asList(keylist.split(",")));


        for (int i = 0; i < jsonArray.size(); i++) {
            try{
                JsonObject jsonelement = jsonArray.get(i).getAsJsonObject();//获取json数组中的每一个json串
                if (jsonelement.has(keyname) ) {//key存在则进入代码体
                    String keyvalue = jsonelement.get(keyname).getAsString();//获取参数传入key所对应的值
                    if(jsonelement.has(valname)){//value键存在进入内层循环
                        for (int j = 0; j < keylist2.size(); j++) {

                            String k1 = keylist2.get(j).toString();

                            if (k1.equals(keyvalue)) {//当参数二的值在参数三列表中时候，输出参数四对应的值
                                String[] result = new String[2];
                                result[0] = keyvalue;
                                JsonElement value = jsonelement.get(valname);
                                if (value.isJsonArray()) {
                                    JsonArray ja = value.getAsJsonArray();
                                    for (int k = 0; k< ja.size(); k++) {
                                       
                                    }
                                } else {
                                    result[1] = jsonelement.get(valname).getAsString();
                                }


                                System.out.println(result[0] + ", " + result[1]);
                            }
                            else{
                                continue;
                            }
                        }
                    }
                    else if (!jsonelement.has(valname)){//value键不存在直接输出key+null
                        String[] result2 = new String[2];
                        result2[0] = keyvalue;
                        result2[1] = null;
                        System.out.println(result2[0] + ", " + result2[1]);

                    }

                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                continue;
            }
        }


    }


    public static void main(String[] args) throws Exception {
        mapJsonArray testmapjsonarray=new mapJsonArray();
        String jsonData="[{\"paramSourceType\":6,\"paramSourceTypeLabel\":3,\"dataType\":6,\"precision\":0,\"value\":[\"05bd9193df074682a24f469fd2294d63\",\"05bd9193df074682a24f469fd2294d62\"],\"key\":\"businessNo2\"},{\"paramSourceType\":5,\"paramSourceTypeLabel\":0,\"dataType\":6,\"precision\":0,\"length\":100,\"value\":\"wangpeng\",\"key\":\"name\",\"required\":1}]";
        //String jsonData="[]";
        Object[] objects =new Object[]{jsonData,"key","businessNo2,name","value"};
        testmapjsonarray.process(objects);
    }
}
