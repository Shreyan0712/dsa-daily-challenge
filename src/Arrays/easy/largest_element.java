//Given an array of integers nums, return the value of the largest element in the array

//Example 1
//Input: nums = [3, 3, 6, 1]
//Output: 6
//Explanation: The largest element in array is 6

//Example 2
//Input: nums = [3, 3, 0, 99, -40]
//Output: 99
//Explanation: The largest element in array is 99

//Now your turn!
//Input: nums = [-4, -3, 0, 1, -8]
//Output:


package Arrays.easy;

// Edge Cases:
//  1) Empty Array (Given in question that length of array is at least 1).
//  2) All elements same

public class largest_element {
    // Main method
    public static void main(String[] args) {
        int [] nums = {3, 3, 0, 99, -40};
        int Output = largestNumber(nums);
        System.out.println("Largest Element is: " + Output);
    }

    public static int largestNumber(int [] nums){
        int largestNum = nums[0];
        // For length 1 nums [] array
        if(nums.length == 1){
            return largestNum;
        }
        for(int i : nums){
            if(i > largestNum){
                largestNum = i;
            }
        }
        return largestNum;
    }
}
