package NumberSystem;
import java.util.*;
public class Armstrong_Number {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        System.out.println("Sum = "+ sum);
        if(sum == original){
            System.out.println(original + " is a Armstrong number");
        }else{
            System.out.println(original + " is not a Armstrong number");
        }
    }
}
