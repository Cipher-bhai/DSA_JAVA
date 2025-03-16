package Function;
import java.util.*;
public class SwapNumber {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1=in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        System.out.println("Number before swapping: ");
        System.out.println("Number 1 before swapped: "+ num1);
        System.out.println("Number 2 before swapped: "+ num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Number after swapped: ");
        System.out.println("Number 1 after swapped :  "+ num1);
        System.out.println("Number 2 after swapped: "+ num2);
    }
}
