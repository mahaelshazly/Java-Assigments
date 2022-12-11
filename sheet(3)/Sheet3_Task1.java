
package com.mycompany.sheet3task1;

import java.util.Scanner;

public class Sheet3task1 {

    public static void main(String[] args) {
        
     Scanner input =new Scanner(System.in);
        System.out.println("please enter a text : ");
      String text = input.next();
      
        text= text.replace(",","");                 
      
        System.out.print("after removing : "+ text);
}

}