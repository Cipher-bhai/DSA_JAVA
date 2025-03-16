package Variable;
import java.util.*;
public class Bill_items {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the cost of a pencil: ");
        float cost_pencil = in.nextFloat();
        System.out.println("Enter the cost of a pen: ");
        float cost_pen = in.nextFloat();
        System.out.println("Enter the cost of an eraser: ");
        float cost_eraser = in.nextFloat();
        float total_cost_items = cost_pencil+cost_pen+cost_eraser;
        System.out.println("Total cost of items before GST tax is "+ total_cost_items);
        float total_cost_incl_gst= (float) (total_cost_items+total_cost_items*0.18);
        System.out.printf("Total cost of items after including 18 percentage of gst tax is %.2f ",total_cost_incl_gst);
    }
}
