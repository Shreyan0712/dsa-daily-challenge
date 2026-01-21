package Arrays.easy;
//Given an integer array nums, rotate the array to the left by one.
//
//
//
//Note: There is no need to return anything, just modify the given array.

//Example 1
//Input: nums = [1, 2, 3, 4, 5]
//Output: [2, 3, 4, 5, 1]
//Explanation:
//Initially, nums = [1, 2, 3, 4, 5]
//Rotating once to left -> nums = [2, 3, 4, 5, 1]

//Example 2
//Input: nums = [-1, 0, 3, 6]
//Output: [0, 3, 6, -1]
//Explanation:
//Initially, nums = [-1, 0, 3, 6]
//Rotating once to left -> nums = [0, 3, 6, -1]

//Now your turn!
//Input: nums = [7, 6, 5, 4]
//Output:


import java.util.Arrays;

public class left_rotate_array_by_one {
    public static void main(String[] args) {
        int [] nums ={1, 2, 3, 4, 5};
        rotateArrayByOne(nums);
    }
    public static void rotateArrayByOne(int[] nums) {
        int first = nums[0];
        for(int i = 0; i < nums.length - 1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1] = first;
        System.out.println(Arrays.toString(nums));
    }
}
