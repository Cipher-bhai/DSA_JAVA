package Loops;
import java.util.*;
public class Sum_Even_Odd {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        int num;
        do{
            System.out.println("Enter a number");
             num = in.nextInt();
            if(num % 2 == 0){
                evenSum += num;
            }else{
                oddSum += num;
            }
            System.out.println("If you want to continue the loop? Press 1 of for exit press 0");
            choice = in.nextInt();
        }while (choice == 1);
        System.out.println("Sum of even number is "+ evenSum);
        System.out.println("Sum of odd number is "+ oddSum);
    }
}
