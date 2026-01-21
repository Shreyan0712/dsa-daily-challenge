package Arrays.easy;
//Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.
//
//Example 1
//Input: nums = [8, 8, 7, 6, 5]
//Output: 7
//Explanation:
//The largest value in nums is 8, the second largest is 7
//
//Example 2
//Input: nums = [10, 10, 10, 10, 10]
//Output: -1
//Explanation:
//The only value in nums is 10, so there is no second largest value, thus -1 is returned
//
//Now your turn!
//Input: nums = [7, 7, 2, 2, 10, 10, 10]
//Output:

public class second_largest_element {

    public static void main(String[] args) {
        int [] nums = {7, 7, 2, 2, 10, 10, 10};
        int result = secondLargestElement(nums);
        System.out.println(result);
    }
    public static int secondLargestElement(int [] nums){
        Long first = null, second = null;
        for(int i : nums){
            //Handles duplicate values, if the variable first/second is not null then it will go on to the next for loop to update the variable first/second with i
            if(first != null && i == first || second != null && i == second){
                continue;
            }
            if(first == null || i > first ){
                second = first;
                first = (long) i;
            } else if(second == null || i > second){
                second = (long) i;
            }
        }
        return (int) (second == null ? -1 : second);
    }
}
