package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Easy26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        for (int i=0; i < nums.length; i++) {
            if(!resultList.contains(nums[i])) {
                resultList.add(nums[i]);
            }
        }
        for(int j=0; j<resultList.size(); j++) {
            nums[j] = resultList.get(j);
        }

        return resultList.size();
    }
}
