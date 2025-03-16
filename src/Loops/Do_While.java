package Loops;
import java.util.*;
public class Do_While {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        do{
            System.out.println(i * n);
            i++;
        }while(i<=10);
    }
}
