package NumberSystem;
import java.util.*;
public class Reverse_Number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while(n>0){
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        System.out.println(original + " reverse  is " + reverse);
    }
}
