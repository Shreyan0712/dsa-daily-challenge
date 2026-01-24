package Arrays.easy;
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

//Example 1:
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]

//Example 2:
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.

//Constraints:
//
//        1 <= nums1.length, nums2.length <= 1000
//        0 <= nums1[i], nums2[i] <= 1000


import java.util.*;

public class LC_349_Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
        int [] output = intersection(nums1, nums2);
        System.out.println(Arrays.toString(output));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        Set<Integer> result = new HashSet<>();
        for(int n : nums2){
            if(set1.contains(n)){
                result.add(n);
            }
        }
        int [] common = new int [result.size()];
        int i = 0;
        for(int j : result){
            common[i] = j;
            i++;
        }
        return common;
    }
}
