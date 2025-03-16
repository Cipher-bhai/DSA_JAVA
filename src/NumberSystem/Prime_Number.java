package NumberSystem;
import java.util.*;
public class Prime_Number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=(num-1);i++){
            if(num % i==0){
                isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println(num+ "is a prime number.");
        }else{
            System.out.println(num +" is not a prime number.");
        }
    }
}
