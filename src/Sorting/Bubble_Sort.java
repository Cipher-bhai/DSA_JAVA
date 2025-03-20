package Sorting;
import java.util.*;
public class Buuble_Sort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the elements of an Arrays: ");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
//        Apply bubble sort in the an Arrays
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
//                    swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted Arrays is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
