package NumberSystem;
import java.util.*;
public class Fibonacci_Number {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        for(int i=1;i<=n;i++){
            System.out.print(firstTerm +",");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
