package Function;
import java.util.*;
public class AddTwoNumber {
    public static void main(String[]args){
        int ans=sum();
        System.out.println(ans);
        System.out.println(add(23,15));
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       int sum=a+b;
//      System.out.println("Sum="+sum);
    return sum;
    }
    static int add(int a,int b){
        int sum = a+b;
        return sum;
    }
}
