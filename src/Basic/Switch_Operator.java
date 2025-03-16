package Basic;
import java.util.*;
public class Switch_Operator {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a =in.nextInt();
        System.out.print("Enter second number: ");
        int b =in.nextInt();
        System.out.print("Enter an Operator(+,-,*,/): ");
        String op=in.next();
        switch (op){
            case "+":
                System.out.println("Sum="+(a+b));
                break;
            case "-":
                System.out.println("Subtraction="+(a-b));
                break;
            case "*":
                System.out.println("Multiplication ="+(a*b));
                break;
            case "/":
                if(b!=0){
                    System.out.println("Division="+(a/b));
                }else{
                    System.out.println("Error: Division by zero ");
                }
                break;
            default:
                System.out.println("Invalid input");
        }


    }
}
