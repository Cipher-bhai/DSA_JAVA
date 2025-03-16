package Conditional;
import java.util.*;
public class Income_Tax_Calculator {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your annually income: ");
        int income = in.nextInt();
        int tax;
        if(income<500000){
            tax = 0;
        }else if(income>= 500000 && income<1000000){
            tax = (int)(income*0.2);
        }else{
            tax = (int)(income*0.3);
        }
        System.out.println("Calculated tax is "+ tax);
    }
}
