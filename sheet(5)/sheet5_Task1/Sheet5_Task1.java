

package sheet5_task1;
import java.util.Scanner;

public class Sheet5_Task1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        circle c=new circle();
        System.out.print("please enter the radius : ");
        double r=input.nextDouble();
        double area=c.area(r);
        System.out.print("area of the circle is : ");
        System.out.println(area);
      
        cylinder a=new cylinder();
        System.out.print("please enter the hieght : ");
        double h=input.nextDouble();
        double vol=a.voulume(r, h);
        System.out.print("area of the circle is : ");
        System.out.println(vol);
    }
}
