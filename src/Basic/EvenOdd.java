package Basic;
import java.util.*;
public class EvenOdd {
   public static void evenOdd(int n ){
       if(n % 2==0){
           System.out.println("Even number");
       }else{
           System.out.println("Odd number");
       }
   }
   public static void main(String[]args){
       evenOdd(13);
   }
}
