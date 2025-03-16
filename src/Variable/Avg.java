package Variable;
import java.util.*;
public class Avg {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 number: ");
        int a = in.nextInt();
        System.out.println("Enter 2 number: ");
        int b = in.nextInt();
        System.out.println("Enter 3 number: ");
        int c = in.nextInt();
        int average=(a+b+c)/3;
        System.out.println("Average of three numbers are "+average);
    }
}
