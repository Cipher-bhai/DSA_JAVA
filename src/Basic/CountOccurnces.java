package Basic;
import java.util.*;
public class CountOccurnces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int count=0;
        while(n>0){
            int rem = n%10;
            if(rem==5){
                count++;
            }
            n = n/10;
        }
        System.out.println("5 occurens is "+count);
    }
}
