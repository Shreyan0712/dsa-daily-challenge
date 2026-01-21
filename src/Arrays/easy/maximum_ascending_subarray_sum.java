package Arrays.easy;
//Given an array of positive integers nums, return the maximum possible sum of an strictly increasing subarray in nums.
//A subarray is defined as a contiguous sequence of numbers in an array.

//Example 1:
//Input: nums = [10,20,30,5,10,50]
//Output: 65
//Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.

//Example 2:
//Input: nums = [10,20,30,40,50]
//Output: 150
//Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.

//Example 3:
//Input: nums = [12,17,15,13,10,11,12]
//Output: 33
//Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.

//Constraints:
//        1 <= nums.length <= 100
//        1 <= nums[i] <= 100

//Edge conditions
//  1) Array of size 1


public class maximum_ascending_subarray_sum {
    public static void main(String[] args) {
        int nums[] = {10,20,30,5,10,50};
        int result = maxAscendingSum(nums);
        System.out.println(result);
    }
    public static int maxAscendingSum(int[] nums) {
        int finalSum = nums[0];
        if(nums.length == 1){
            return finalSum;
        }
        for(int i = 0; i < nums.length; i++){
            int sum = nums[i];
            while((i+1) < nums.length && nums[i+1] > nums[i]) {
                sum = sum + nums[i+1];
                i++;
            }
            if(sum > finalSum){
                finalSum = sum;
            }
        }
        return finalSum;
    }
}

// Understand the solution
// The outer for loop runs through each element of the array nums[]
// Inside it the while loop checks if the next element (i+1) is within bounds and greater than the current element (i)
// The while loop keeps on summing the values iteratively and incrementing i each time it adds a number to sum
// When the loop finds that i+1 < i it stops and i is not updated. That means that for nums[] = {10,20,30,5,10,50} while loop adds 10,20 and 30 and stops at 30.
// This makes the i value of the outer for loop, the index of 30 which is i = 2.
// After the entire execution of the contents inside the for loop, the for loop follows the update condition which is set to i++. Therefore i becomes i = 3 i.e. 5.
// Hence i in the for loop starts from the index where the lower value element was found, thus skipping the redundant calculation for the elements in between.