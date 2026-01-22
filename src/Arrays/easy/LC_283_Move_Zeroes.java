package Arrays.easy;
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.

//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

//Example 2:
//Input: nums = [0]
//Output: [0]

//Constraints:
//        1 <= nums.length <= 104
//        -231 <= nums[i] <= 231 - 1

import java.util.Arrays;

public class LC_283_Move_Zeroes {
    public static void main(String[] args) {
        int [] nums = {0,0,1};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int pos = 0;
        int n = nums.length;
       for(int i = 0; i < n; i++){
           if(nums[i] != 0){
               nums[pos] = nums[i];
               pos++;
           }
       }
        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
