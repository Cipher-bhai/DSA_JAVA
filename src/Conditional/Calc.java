package Conditional;
import java.util.*;
public class Calc {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2 number: ");
        int b = sc.nextInt();
        System.out.print("Enter operator for calculation: ");
        char operator = sc.next().charAt(0);
        switch (operator){
           case '+':
               System.out.println("Sum = "+ (a+b));
               break;
           case '-':
               System.out.println("Subtract = "+ (a-b));
               break;
           case '*':
               System.out.println("Multiplication ="+ (a*b));
               break;
           case '/':
               System.out.println("Division="+(a/b));
               break;
           case '%':
               System.out.println("Modulo(Remainder)="+(a%b));
               break;
           default:
               System.out.println("Wrong input?");
       }
    }
}
