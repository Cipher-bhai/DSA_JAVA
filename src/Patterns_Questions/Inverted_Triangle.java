package Patterns_Questions;
import java.util.*;
public class Inverted_Triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines you want to print? ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i+1);j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
