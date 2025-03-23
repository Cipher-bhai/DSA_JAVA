package Searching;
import java.util.*;
public class Linear_Search_1DArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int []num = new int[5];
        int flag = 0;
        System.out.println("Enter the elements of an Arrays: ");
        for(int i =0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the elements you want to search?");
        int target = sc.nextInt();
        for(int i=0;i<num.length;i++){
            if(num[i]==target){
                System.out.println("Elements found at index : "+ i);
                flag =1;
            }
        }
        if(flag == 1){
            System.out.print("Record exist in the Array.");
        }else{
            System.out.println("Record does not exist in the Array .");
        }
    }
}
