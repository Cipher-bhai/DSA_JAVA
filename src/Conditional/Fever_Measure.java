package Conditional;
import java.util.*;
public class Fever_Measure {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entered temperature in Celsius: ");
        double tempC= sc.nextDouble();
        double tempF =(tempC * 9/5)+32;
        System.out.println("Calculated temperature in Fahrenheit: "+tempF);
        if(tempF<98.6){
            System.out.println("Normal");
        }else if(tempF>=98.6 && tempF<=100.4){
            System.out.println("Low-grade fever.");
        }else if(tempF>100.4 && tempF<=102.2){
            System.out.println("moderate-grade fever.");
        }else{
            System.out.println("High-grade fever");
        }
    }
}
