package Basic;
import java.util.*;
public class INRtoUSD {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the currency in INR: ");
        double rupees = sc.nextDouble();
        double usdRate = 0.012;
        double usd = rupees*usdRate;
        System.out.println(rupees + " Rupees equal in  dollar is "+ usd + " usd");
    }
}
