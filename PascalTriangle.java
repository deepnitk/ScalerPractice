Write a program to input an integer N from user and print pascal triangle up to N rows.

public class Solution {
    public int[][] solve(int A) {
        int[][] triangle = new int[A][A];
        for(int i=0; i< A; i++){
            for(int j=0;j< A;j++){
                triangle[i][j] = 0;
            }
        }
        for(int i=0; i< A; i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    triangle[i][j] =1;
                else
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                
            }
        }
        return triangle;
    }
}


