package org.example;

import java.util.ArrayList;
import java.util.List;

public class Easy27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int value = 3;
        System.out.println(removeElement(nums, value));
    }
    public static int  removeElement(int[] nums, int val) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                resultList.add(nums[i]);
            }
        }
        for(int j = 0; j < resultList.size() ; j++) {
            nums[j] = resultList.get(j);
        }

        return resultList.size();
    }
}
