package Arrays.easy;

// Leet code 414. Third Maximum Number

//Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

//Example 1:
//Input: nums = [3,2,1]
//Output: 1
//Explanation:
//The first distinct maximum is 3.
//The second distinct maximum is 2.
//The third distinct maximum is 1.

//Example 2:
//Input: nums = [1,2]
//Output: 2
//Explanation:
//The first distinct maximum is 2.
//The second distinct maximum is 1.
//The third distinct maximum does not exist, so the maximum (2) is returned instead.

//Example 3:
//Input: nums = [2,2,3,1]
//Output: 1
//Explanation:
//The first distinct maximum is 3.
//The second distinct maximum is 2 (both 2's are counted together since they have the same value).
//The third distinct maximum is 1.

//Constraints:
//        1 <= nums.length <= 104
//        -231 <= nums[i] <= 231 - 1


// Edge Cases:
//      1) Array is of length 1.
//      2) Third max doesn't exist, i.e. nums.length < 3
//      3) All elements are same


public class third_maximum_number {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        int Output = thirdMax(nums);
        System.out.println("The third maximum number is: " + Output);
    }

    public static int thirdMax(int[] nums) {
        Long firstMax = null, secondMax = null, thirdMax = null;
        for (int i : nums) {
            if (firstMax != null && firstMax == i || secondMax != null && secondMax == i || thirdMax != null && thirdMax == i) {
                continue;
            }
            if (firstMax == null || i > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = (long) i;
            } else if (secondMax == null || i > secondMax) {
                thirdMax = secondMax;
                secondMax = (long) i;
            } else if (thirdMax == null || i > thirdMax) {
                thirdMax = (long) i;
            }

        }
        return thirdMax == null? firstMax.intValue() : thirdMax.intValue();
    }
}