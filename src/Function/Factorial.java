package Function;
import java.util.*;
public class Factorial {
    public static int factorialNumber(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int binCoeff(int n ,int r){
        int fact_n=factorialNumber(n);
        int fact_r =factorialNumber(r);
        int bincoeff=factorialNumber(n-r);
        return bincoeff;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        int res = factorialNumber(n);
//        System.out.println("Factorial of "+ n +" is "+ res);
        System.out.println(binCoeff(5,2));
    }
}
