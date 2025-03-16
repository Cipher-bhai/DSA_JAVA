package Basic;
import java.util.*;
public class NestedSwitch {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        int empid=in.nextInt();
        System.out.println("Enter department name: ");
        String dep=in.next();
        switch(empid){
            case 1:
                System.out.println("Satyendra Bharti");
                break;
            case 2:
                System.out.println("Anish Bharti");
                break;
            case 3:
                System.out.println("Suraj Bharti");
                break;
            case 4:
                switch (dep){
                    case "IT":
                        System.out.println("Department is IT");
                        break;
                    case "AI":
                        System.out.println("Department is AI");
                        break;
                    default:
                        System.out.println("Not a valid department");
                }
                break;
            default:
                System.out.println("Invalid empId");
        }
    }
}
