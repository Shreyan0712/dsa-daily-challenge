package Arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class LC_54_Spiral_Matrix {
    public static void main(String[] args) {
        int [][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {


            for (int col = left; col <= right; col++) {
                res.add(matrix[top][col]);
            }
            top++;


            for (int row = top; row <= bottom; row++) {
                res.add(matrix[row][right]);
            }
            right--;


            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    res.add(matrix[bottom][col]);
                }
                bottom--;
            }


            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    res.add(matrix[row][left]);
                }
                left++;
            }
        }

        return res;
    }

}
