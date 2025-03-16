package NumberSystem;
import java.util.*;
public class Palindrome_Number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while(n>0){
            int rem = n % 10;
            reverse = reverse * 10 +rem;
            n = n/10;
        }
        if(reverse == original){
            System.out.println(original + " is a Palindrome number.");
        }else {
            System.out.println(original + " is not a Palindrome number. ");
        }
    }
}
