package Searching;
import java.util.*;
public class Binary_Search_1DArrays {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Arrays: ");
        int size = sc.nextInt();
        int [] num = new int[size];
        System.out.println("Enter the elements of an Arrays.");
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        int start =0;
        int end = num.length-1;
        int flag = 0;
        System.out.println("Enter the elements you want to search? ");
        int target = sc.nextInt();
        while(start<=end){
            int mid =(start+end)/2;
            if(num[mid] == target){
                System.out.println("Element found at index :"+ mid);
                flag =1;
                break;
            } else if (num[mid]>target) {
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        if(flag == 1){
            System.out.println("Record exist in the Array");
        }else{
            System.out.println("Record does not exit in the Array");
        }
    }
}
