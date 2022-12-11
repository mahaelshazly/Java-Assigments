
package com.mycompany.sheet2task1;

import java.util.Scanner;

public class Sheet2task1 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
         System.out.print("enter the size of the array ");
        int n = input.nextInt();
        double []arr= new double[n];
        
        System.out.println("enter random numbers ");
        for(int i=0; i<n;i++)
        {  arr[i]=input.nextDouble();}
        
       double largest =arr[0];
       
        for(int i=0; i<n;i++)
        { if(largest<arr[i])    //to know the largest number in the input array
            largest=arr[i];
            }
        System.out.print("the largest num is : " + largest ) ;
        
        
    }
}

