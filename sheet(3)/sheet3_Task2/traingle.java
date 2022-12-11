
package sheet3_task2;

public class traingle {
    private double h,a,b,c;
       
        public void set_t (double high, double L1,double L2,double L3)
        {  h=high; 
          a=L1;
          b=L2;
          c=L3;
        } 
        
        public double area ( )
        { return (0.5*b*h); }
        
         public double circumference ()
         { return (a+b+c) ;  }
         
}
