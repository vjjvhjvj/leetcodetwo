package ikun;

import java.util.*;

public class IkunFour {
    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {
        int length=matrix.length;
        //先上下交换
        for (int i=0;i<length/2;i++){
            int [] temp=matrix[i];
            matrix[i]=matrix[length-1-i];
            matrix[length-1-i]=temp;
        }
        //在对交线交换
        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
