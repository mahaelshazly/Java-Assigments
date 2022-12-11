
package sheet5_task2;


public class car extends vehicle {
        String brand;
        void setbrand (String b)
        { brand=b;
        }
        
        void get_color_and_brand(){
            System.out.println("the color is "+color);
            System.out.println("the brand is "+brand);
        }
    }