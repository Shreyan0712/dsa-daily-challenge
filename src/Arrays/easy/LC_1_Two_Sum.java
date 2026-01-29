package Arrays.easy;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]

//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]

//Constraints:
//
//        2 <= nums.length <= 104
//        -109 <= nums[i] <= 109
//        -109 <= target <= 109
//Only one valid answer exists.

//        Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC_1_Two_Sum {
    public static void main(String[] args) {
        int [] nums = {-3,4,3,90};
        twoSum(nums,0);
    }
    //Brute Force method
//    public static int[] twoSum(int[] nums, int target) {
//        int n = nums.length;
//        int [] output = new int [2];
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j < n; j++){
//                if(nums[i] + nums[j] == target){
//                    output[0] = i;
//                    output[1] = j;
//                    System.out.println(Arrays.toString(output));
//                    return output;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(output));
//        return output;
//    }

    //Optimal solution
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int [] output = new int [2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                output[0] = map.get(complement);
                output[1] = i;
                System.out.println(Arrays.toString(output));
                return output;
            }
            map.put(nums[i], i);
        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}
