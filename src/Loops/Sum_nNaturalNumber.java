package Loops;
import java.util.*;
public class Sum_nNaturalNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =sc.nextInt();
        int sum=0;
        int i = 1;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum ="+ sum);
    }
}
