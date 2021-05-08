package edu.xcdq.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:hanxuejie
 * @Date:2021/5/8 10:06
 */

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("henan","河南");  //entry 实例
        map.put("hebei","河北");
        map.put("hubei","湖北");
        map.put("hubei","湖北1");//键重复会覆盖掉原有的值
        /*map.put("null","空1");
        map.put(null,"空2");
        map.put(null,null);*/
        System.out.println(map);

        for (Map.Entry<String,String>m:map.entrySet()){
            System.out.println(m);
        }
        for (String k:map.keySet()){
            System.out.println(k+"="+map.get(k));
        }
        for (String v:map.values()){
            System.out.println(v);
        }
    }
}
