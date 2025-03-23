package Sorting;
import java.util.*;
public class Selection_Sort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        System.out.print(" Enter the elements of an Arrays: ");
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
//        Apply Selection sort
        for(int i=0;i<num.length-1;i++){
            int min = i;
            for(int j=i+1;j<num.length;j++){
                if(num[j]<num[min]){
                    min = j;
                }
            }
            int temp = num[i];
            num[i] = num[min];
            num[min] = temp;
        }
        System.out.print("Sorted Array is: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
    }
}
