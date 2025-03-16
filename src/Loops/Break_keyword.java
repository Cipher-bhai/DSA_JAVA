package Loops;
import java.util.*;
public class Break_keyword {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Loop break now!");
    }
}
