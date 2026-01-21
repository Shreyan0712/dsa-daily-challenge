package Arrays.easy;
//Leet code #1752
//Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
//There may be duplicates in the original array.
//Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

//Example 1:
//Input: nums = [3,4,5,1,2]
//Output: true
//Explanation: [1,2,3,4,5] is the original sorted array.
//You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].

//Example 2:
//Input: nums = [2,1,3,4]
//Output: false
//Explanation: There is no sorted array once rotated that can make nums.

//Example 3:
//Input: nums = [1,2,3]
//Output: true
//Explanation: [1,2,3] is the original sorted array.
//You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.


// Base Conditions:
// 1) there can only be 1 break point in an array sorted in increasing order (the first and the last element)

public class check_if_array_is_sorted_and_rotated {
    public static void main(String[] args) {
        int [] nums = {1,1,1};
        boolean output = check(nums);
        System.out.println(output);
    }
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] > nums[i+1]){
                count++;
            }
        }
        // Arrays which were rotated will have 1 break and for that condition
        if(nums[n-1] > nums[0]){
            count++;
        }
        return count<=1;
    }
}
