package Arrays.medium;

//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.

//Example 1:
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]

//Example 2:
//Input: nums = [2,0,1]
//Output: [0,1,2]

//Constraints:
//
//n == nums.length
//1 <= n <= 300
//nums[i] is either 0, 1, or 2.


//Follow up: Could you come up with a one-pass algorithm using only constant extra space?

// We know there will only be 3 types of elements in the array 0, 1, 2
// No of objects will be n or nums.length

import java.util.Arrays;

public class LC_75_Sort_Colours {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
//    public static void sortColors(int[] nums) {
//        int n = nums.length;
//        int zero = 0;
//        int one = 0;
//        int two = 0;
//        for(int i = 0; i < n; i++){
//            if(nums[i] == 0){
//                zero++;
//            } else if(nums[i] == 1){
//                one++;
//            }else if(nums[i] == 2){
//                two++;
//            }
//        }
//        System.out.println(zero + "\n" + one + "\n" + two + "\n");
//        int i = 0;
//        while(i < n){
//            if(zero != 0){
//                nums[i] = 0;
//                i++;
//                zero--;
//            }else if(one != 0) {
//                nums[i] = 1;
//                i++;
//                one--;
//            }else if(two != 0){
//                nums[i] = 2;
//                i++;
//                two--;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//    }

    //Alternate solution
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length - 1;
        while(mid < high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            }else if(nums[mid] == 1) {
                mid++;
            }else if (nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void swap( int [] nums, int firstIndex, int secondIndex){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
}

