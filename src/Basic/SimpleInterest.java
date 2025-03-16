package Basic;
import java.util.*;
public class SimpleInterest {
    public static int simpleInterest(int p,int r,int t){
        int si=(p*r*t)/100;
        return si;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal of amount: ");
        int P = sc.nextInt();
        System.out.println("Enter the rate of amount: ");
        int R =sc.nextInt();
        System.out.println("Enter the time of amount: ");
        int T = sc.nextInt();
        int SimpleInterest=simpleInterest(P,R,T);
        System.out.println("Simple Interest is "+ SimpleInterest);
    }
}
