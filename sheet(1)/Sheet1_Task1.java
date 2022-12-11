
package sheet1_task1;
import java.util.Scanner;

public class Sheet1_task1 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in); 
       System.out.print("Enter the Value of n: ");
        int n =input . nextInt(); 
        System.out.print("Enter the Value of r: ");
        int r =input . nextInt(); 
        
        int fn=1 ,fr=1 ,fnr=1;
        int c,p=1; 
       
        //to calculate factorial of n
        for(int i=1;i<=n;i++) 
        {  fn=fn*i ; } 
         
        //to calculate factorial of r
        for(int i=1;i<=r;i++) 
        { fr=fr*i; } 
         
         //to calculate factorial of (n-r)
        for(int i=1;i<=(n-r);i++) 
        {  fnr=fnr*i; } 
        
         
        c=fn/(fr*fnr);       //to calculate Combination 
        p=fn/fnr;           //to calculate Permutation 
         
        System.out.println("Combination of " +n+ " and " + r+ " equal " + c); 
        System.out.println("Permutation of " +n+ " and " + r+ " equal " +p );
    }
}
