package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Med15 {
  public static void main(String[] args) {

    int[] sums = {-1,0,1,2,-1,4};
    threeSum(sums);
  }
  public static List<List<Integer>> threeSum(int[] sums) {
    List<List<Integer>> ans = new ArrayList<>();

    Arrays.sort(ans.toArray());
    for(int i = 0; i < sums.length-2; i++) {
      int total = 0;
      boolean changed = false;
      int sum = sums[i] + sums[i+1] + sums[i+2];
      if (sum == 0) {
        total = sum;
        changed = true;
        ans.add(Arrays.asList(sums[i], sums[i+1], sums[i+2]));
      }
    }

    System.out.println(ans);
    return ans;
  }
}
