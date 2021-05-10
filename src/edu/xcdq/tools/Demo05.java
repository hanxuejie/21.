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
        //4 求最大最小值
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
        // 5 替换
        Collections.replaceAll(nums,0,100);
        System.out.println(nums);
        //6 求频率
        System.out.println(Collections.frequency(nums,100));
        //7 二分搜索，使用的条件是集合是有序的
        Collections.sort(nums);
        System.out.println(nums);
        int i = Collections.binarySearch(nums,3);
        System.out.println("位置"+i);
    }
}
