package Function;
import java.util.Scanner;
public class ArmstrongNumber {
    static boolean isArmstrong(int n){
        int original=n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum+rem*rem*rem;
            n = n/10;
        }

        return sum==original;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n= in.nextInt();
//        System.out.println(isArmstrong(n));
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i +" ");
            }
        }

    }
}
