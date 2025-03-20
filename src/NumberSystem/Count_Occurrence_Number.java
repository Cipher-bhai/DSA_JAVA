package NumberSystem;
import java.util.*;
public class Count_Occurrence_Number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int rem = n % 10;
            if(rem == 5){
                count ++;
            }
            n = n/10;
        }
        System.out.println("Total number of 5 is "+count);
    }
}
