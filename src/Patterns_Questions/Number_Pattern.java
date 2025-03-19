package Patterns_Questions;
import java.util.*;
public class Number_Pattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rows you want to print? ");
        int n = sc.nextInt();
        int number = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number + " ");
                number ++;
//                System.out.print(i + " ");
//                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
