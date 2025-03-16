package Basic;
import java.util.*;
public class LargestNumber {
    static int largestNumber(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[]args){
        System.out.println(largestNumber(24,56));
        System.out.println(largestNumber(44,434));
    }
}
