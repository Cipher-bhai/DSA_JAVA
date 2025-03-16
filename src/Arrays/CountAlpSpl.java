package Arrays;
import java.util.*;
public class CountAlpSpl {
public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = in.nextLine();
    int alp,digit,spl;
    alp=digit=spl=0;
    for(int i=0;i<str.length();i++){
        char ch =str.charAt(i);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            alp++;
        } else if (ch>='0' && ch<='9') {
            digit++;
        }else {
            spl++;
        }
    }
    System.out.println("Number of Digit are: "+digit);
    System.out.println("Number of Alphabets are :"+alp);
    System.out.println("Number of Special symbol are: "+ spl);
}
}
