package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Author:hanxuejie
 * @Date:2021/5/10 9:37
 */

public class Demo05 {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList<>();
        nums.add(2);
        nums.add(0);
        nums.add(-5);
        nums.add(0);
        nums.add(3);

        //1 排序sort
        Collections.sort(nums);
        System.out.println(nums);
        //2 反转 reverse
        Collections.reverse(nums);
        System.out.println(nums);
        //3 混洗
        Collections.shuffle(nums);
        System.out.println(nums);
    }
}
