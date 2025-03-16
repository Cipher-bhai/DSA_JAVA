package Conditional;
import java.util.*;
public class Largest_Three {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2 number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3 number: ");
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is larger");
        }else if(b>=c){
            System.out.println("B is larger ");
        }else{
            System.out.println("C is larger");
        }
    }
}
