package Variable;
import java.util.*;
public class Area_Sq {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        int side = in.nextInt();
        int area = side*side;
        System.out.println("Area of Square is "+area);
    }
}
