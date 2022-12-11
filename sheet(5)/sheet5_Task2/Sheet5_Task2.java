

package sheet5_task2;
import java.util.Scanner;

public class Sheet5_Task2 {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        car c=new car();
        System.out.print("input the color : ");
        String color=input.nextLine();
        c.setcolor(color);
        
        System.out.print("input the brand : ");
        String brand=input.nextLine();
        c.setbrand(brand);
        
        c.get_color_and_brand();
    }
}
