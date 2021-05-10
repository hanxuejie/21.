package edu.xcdq.tools;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author:hanxuejie
 * @Date:2021/5/10 8:13
 */

public class Demo02 {
    public static void main(String[] args) {
        String str[]={"中文", "计算机", "ABC", "123", "qq@qq.com"};
        //1 将数组转换成集合    new HashSet<>(Arrays.asList(str));
        HashSet<String> set=new HashSet<>(Arrays.asList(str));
        System.out.println(set);
        // 2 将集合再转换成集合  toArray();
        Object[]arr=set.toArray();
        for (Object a:arr){
            System.out.println(a);
        }
    }
}
