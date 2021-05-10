package edu.xcdq.tools;

import java.util.*;

/**
 * @Author:hanxuejie
 * @Date:2021/5/10 8:21
 */

public class Demo03 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("1","A");
        map.put("2","B");
        map.put("3","C");
        //1
        Set<String>keys=map.keySet();
        System.out.println(keys);
        //2把set转换成其他集合
        ArrayList<String>alistkeys=new ArrayList<>(keys);
        System.out.println(alistkeys);
        //3
        Collection<String> v=map.values();
        System.out.println(v);
        //4
        LinkedList<String>llistv=new LinkedList<>(v);
        System.out.println(llistv);
    }
}
