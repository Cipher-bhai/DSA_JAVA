package Patterns_Questions;
import java.util.*;
public class Triangle_Pattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for how many lines you want?");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
