package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author:hanxuejie
 * @Date:2021/5/8 11:26
 */

public class Demo01 {
    public static  void main(String[] args) {
        String str[] = {"中文", "计算机", "ABC", "123", "qq@qq.com"};
        List<String> list = Arrays.asList(str);//
        System.out.println(list);

        //2.将数组转换成数组列表（链式列表）
        ArrayList <String>alist=new ArrayList<>(Arrays.asList(str));
        LinkedList<String>llist=new LinkedList<>(Arrays.asList(str));
        alist.remove("ABC");
        llist.add("1321123");
        System.out.println(llist);

        //3.将列表转换成数组  列表.toArray
        Object[]str2=alist.toArray();
        for (Object o:str2){
            System.out.println(o+"");
        }
        System.out.println();
        Object[]str3=alist.toArray();
        for (Object o:str3){
            System.out.println(o+"");
        }
    }
}
