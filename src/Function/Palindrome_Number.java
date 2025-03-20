package Function;
import java.util.*;
public class Palindrome_Number {
    public static boolean palindromeNumber(int n){
        int original = n;
        int reverse =0;
        while(n>0){
            int rem = n%10;
            reverse = reverse*10+rem;
            n = n /10;
        }
        if(reverse == original){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        boolean res= palindromeNumber(num);
        System.out.println(res);
    }
}
