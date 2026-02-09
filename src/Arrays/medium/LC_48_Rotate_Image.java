package Arrays.medium;

import java.util.Arrays;

public class LC_48_Rotate_Image {
    public static void main(String[] args) {
        int [][] nums = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(nums);
    }
    public static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix.length;
        for(int i = 0; i < row; i++){
            for(int j = i+1; j < col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        revrse(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void revrse(int [][] nums){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int j = 0;
            int k = n-1;
            while(j < k){
                int temp = nums[i][j];
                nums[i][j] = nums[i][k];
                nums[i][k] = temp;
                j++;
                k--;
            }
        }
    }
}
