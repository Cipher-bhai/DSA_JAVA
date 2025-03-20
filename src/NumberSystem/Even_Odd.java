package NumberSystem;
import java.util.*;
public class Even_Odd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println(n +" is a Even number.");
        }else{
            System.out.println(n + " is an Odd number. ");
        }
    }
}
