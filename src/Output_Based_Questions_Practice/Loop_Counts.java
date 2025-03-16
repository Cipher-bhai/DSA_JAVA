package Output_Based_Questions_Practice;

public class Loop_Counts {
    public static void main(String[]args){
        int counter =0;
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            i += 2;
            counter ++;
        }
        System.out.println("Loop counter="+counter);
    }
}
