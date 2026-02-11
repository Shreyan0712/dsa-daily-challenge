package Arrays.easy;

import java.util.*;

public class LC_2248_Intersection_Of_Multiple_Arrays {
    public static void main(String[] args) {
        int [][] nums = {{4,1,2,3,5},{1,2,4,3},{4,3,5,6}};
        intersection(nums);
    }
    public static List<Integer> intersection(int[][] nums) {
        int m = nums.length;
        int [] count = new int [1001];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < nums[i].length; j++){
                count[nums[i][j]]++;
            }
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] == m){
                list.add(i);
            }
        }
        return list;
    }
}
