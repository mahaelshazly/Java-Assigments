
package sheet1.task2;
import java.util.Scanner;

public class Sheet1Task2 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.print("please enter a number : ");
       int ascii = input.nextInt();
       
       //make a type casting to the ascii code 
       char ch = (char) ascii;
       System.out.println("the character is " + ch);
}
}
