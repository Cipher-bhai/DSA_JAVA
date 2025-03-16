package Basic;
import java.util.*;
public class TypeCasting {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float a = sc.nextFloat();
        System.out.println("The value of a in float is "+a);
        int b = (int) a; // expliciting type casting of value from float to int
        System.out.println("The value of a in int is "+b);
    }
}
