package Arrays.easy;
//Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
//After doing so, return the array.

//Example 1:
//Input: arr = [17,18,5,4,6,1]
//Output: [18,6,6,6,1,-1]
//Explanation:
//        - index 0 --> the greatest element to the right of index 0 is index 1 (18).
//        - index 1 --> the greatest element to the right of index 1 is index 4 (6).
//        - index 2 --> the greatest element to the right of index 2 is index 4 (6).
//        - index 3 --> the greatest element to the right of index 3 is index 4 (6).
//        - index 4 --> the greatest element to the right of index 4 is index 5 (1).
//        - index 5 --> there are no elements to the right of index 5, so we put -1.

//Example 2:
//Input: arr = [400]
//Output: [-1]
//Explanation: There are no elements to the right of index 0.

//Constraints:
//
//        1 <= arr.length <= 104
//        1 <= arr[i] <= 105

import java.util.Arrays;

public class LC_1299_Replace_Elements_With_Greatest_Element_On_Right_Side {
    public static void main(String[] args) {
        int [] nums = {17,18,5,4,6,1};
        replaceElements(nums);
    }
    public static int[] replaceElements(int[] arr) {
            int n = arr.length;
            int max = arr[n-1];
            for(int i = n-2; i >= 1;i--){
                int current = arr[i];
                arr[i] = max;
                max = Math.max(max,current);
            }
            arr[0] = max;
            arr[n-1]= -1;
            System.out.println(Arrays.toString(arr));
            return arr;
    }
}
