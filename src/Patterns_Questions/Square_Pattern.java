package Patterns_Questions;
import java.util.*;
public class Square_Pattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines you want? ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j = 1;j<=r;j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
