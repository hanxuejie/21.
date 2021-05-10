package edu.xcdq.tools;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author:hanxuejie
 * @Date:2021/5/10 9:08
 */

public class Demo04 {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        for (int i=0;i<200;i++){
            map.put(i,"haha"+i);
        }
        Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String>next=iterator.next();
            System.out.println(next);
        }
    }
}
