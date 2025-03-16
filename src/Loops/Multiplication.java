package Loops;
import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.println("Multiplication of table "+ i + ": ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
