package Arrays.easy;
//Given a binary array nums, return the maximum number of consecutive 1's in the array.

//Example 1:
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

//Example 2:
//Input: nums = [1,0,1,1,0,1]
//Output: 2

//Constraints:
//
//        1 <= nums.length <= 105
//nums[i] is either 0 or 1.

public class LC_485_Max_Consecutive_Ones {
    public static void main(String[] args) {
        int [] nums = {1,1,0,1,1,1};
        findMaxConsecutiveOnes(nums);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int ptr = 0;
        int max = 0;
        while(ptr < n) {
            int count = 0;
            while (ptr < n && nums[ptr] != 0) {
                count++;
                ptr++;
            }
            max = Math.max(max, count);
            ptr++;
        }
        System.out.println(max);
        return max;
    }
}
