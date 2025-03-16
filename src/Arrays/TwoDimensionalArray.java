package Arrays;
import java.util.*;
public class TwoDimensionalArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of columns: ");
        int m = sc.nextInt();
        int [][]matrix = new int[n][m];
        System.out.println("Enter the elements:" );
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                matrix[i][j] =sc.nextInt();
            }
        }
        System.out.println("Matrix created is:");
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
