
package sheet3_task2;


public class Sheet3_Task2 {

    public static void main(String[] args) {
       
        traingle t1 = new traingle();
        
        t1.set_t(5, 5, 3, 6);
         System.out.println( "area of traingle is " + t1.area());
         System.out.println( "circ of traingle is " + t1.circumference() ) ;
        
        circle c1 = new circle();
        
        c1.set_c(5);
       System.out.println( "area of circle is " + c1.area() );
        System.out.println( "circ of circle is " + c1.circumference());
    }
}
