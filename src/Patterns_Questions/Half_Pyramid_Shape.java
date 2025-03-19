package Patterns_Questions;
import java.util.*;
public class Half_Pyramid_Shape {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total rows you want to print?");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print( " ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
