package edu.cnm.deepdive;

public class MaxSpan2 {

  public static int maxSpan(int[] nums) {

    int max = 0;
    int currentMax;

    for (int i = 0; i <= nums.length / 2; ++i) {
      currentMax = nums.length - i;
      for (int j = nums.length - 1; j >= 0; --j) {
        if (nums[j] == nums[i] && currentMax > max) {
          max = currentMax;
        } else {
          currentMax--;
        }

      }
    }
    return max;

  }

}
