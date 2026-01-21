package Arrays.medium;
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

//Example 1:
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]

//Example 2:
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation:
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]

//Constraints:
//1 <= nums.length <= 105
//-231 <= nums[i] <= 231 - 1
//0 <= k <= 105

import java.sql.Array;
import java.util.Arrays;

public class LC_189_rotate_array {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        //The following solution also works but this approach takes longer time due creation a of new array (memory allocation) and then reassignment of elements of nums and newNums
//        int [] newNums = new int [n];
//        k = k % n;
//        for(int i = 0; i < n; i++) {
//            int index = (i+k) % n;
//            newNums[index] = nums[i];
//        }
//        System.arraycopy(newNums, 0, nums, 0, n);

        //More efficient Reversal method
        k = k % n;
        Reversal(nums,0, n-1);
        Reversal(nums, 0, k-1);
        Reversal(nums, k, n-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void Reversal(int nums[], int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
//  Intution behind the reversal logic:
// We are given nums = [1,2,3,4,5,6,7]
// suppose A = [1,2,3,4] ad B = [5,6,7] i.e. nums = [A,B]
// Our output should look like nums = [5,6,7,1,2,3,4]
// if you notice there is a pattern in the output, which is nums becomes nums = [Br,Ar] (Br = Reversed B, Ar = Reversed A)
