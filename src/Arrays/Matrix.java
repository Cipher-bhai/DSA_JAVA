package Arrays;
import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of rows: ");
        int m=in.nextInt();
        System.out.println("Enter size of columns: ");
        int n = in.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] =in.nextInt();
            }
        }
        System.out.println("Matrix ");
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        System.out.print(matrix[i][j] +" ");
    }
    System.out.println();
}
    }
}
