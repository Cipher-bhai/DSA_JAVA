package Basic;
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fruits name: ");
        String fruit=sc.nextLine();
        switch (fruit){
            case"Mango":
                System.out.println("Mango is the king of fruit");
                break;
            case "Apple":
                System.out.println("Apple is in red color");
                break;
            case "Grapes":
                System.out.println("It's taste is sour");
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
