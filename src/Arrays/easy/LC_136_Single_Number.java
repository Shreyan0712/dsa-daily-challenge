package Arrays.easy;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

//Example 1:
//Input: nums = [2,2,1]
//Output: 1

//Example 2:
//Input: nums = [4,1,2,1,2]
//Output: 4

//Example 3:
//Input: nums = [1]
//Output: 1

//Constraints:
//
//        1 <= nums.length <= 3 * 104
//        -3 * 104 <= nums[i] <= 3 * 104

import java.util.ArrayList;
import java.util.List;

public class LC_136_Single_Number {
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        int output = singleNumber(nums);
        System.out.println(output);
    }
    public static int singleNumber(int[] nums) {
        int num = 0;
        int n = nums.length;
        for(int i =0; i < n; i++){
            num ^= nums[i];
        }
        return num;
    }
}
