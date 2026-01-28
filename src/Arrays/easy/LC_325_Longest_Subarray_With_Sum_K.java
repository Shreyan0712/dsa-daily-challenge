package Arrays.easy;
//Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.

//Example 1
//Input: nums = [10, 5, 2, 7, 1, 9],  k=15
//Output: 4
//Explanation:
//The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

//Example 2
//Input: nums = [-3, 2, 1], k=6
//Output: 0
//Explanation:
//There is no sub-array in the array that sums to 6. Therefore, the output is 0.

//Now your turn!
//Input: nums = [-1, 1, 1], k=1
//Output:

import java.util.HashMap;

public class LC_325_Longest_Subarray_With_Sum_K {
    public static void main(String [] args) {
        int [] nums = {10, 5, 2, 7, 1, 9};
        longestSubarray(nums,15);
    }

    public static int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int currentSum = 0;
        int earlierSum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < n ; i++){
            currentSum += nums[i];
            if(map.containsKey(currentSum - k)){
                int j = map.get(currentSum-k);
                int length = i - j;
                max = Math.max(max, length);
            }
            if(!map.containsKey(currentSum)){
                map.put(currentSum, i);
            }
        }
        System.out.println(max);
        return max;
    }
}
