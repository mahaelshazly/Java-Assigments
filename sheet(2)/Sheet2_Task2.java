
package com.mycompany.sheet2task2;

import java.util.Scanner;
public class Sheet2task2 {

    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        System.out.print("enter number of rows: ");
        int r = input.nextInt();
        System.out.print("enter number of coloumns: ");
        int c =input.nextInt();
        
        int [][]arr=new int[r][c];
        
        System.out.println("enter elements of the array : ");
        for(int i=0; i<r;i++)                   //input the array from the user
        {    for(int j=0; j<c; j++ ) 
            { arr[i][j]=input.nextInt(); } }
        
            
        int [][]transport= new int[r][c];
        for(int i=0; i<r;i++)
        {   for(int j=0; j<c; j++ ) 
            { transport[j][i]=arr[i][j]; } }       //make a transport to the input array
        
        System.out.println("the transpose of a 2D array :");
        
        for(int i=0; i<r;i++)
        {
            for(int j=0; j<c; j++ ) 
            { System.out.print(transport[i][j]+" ");  }
            System.out.println();
        }
            
        
    }  
    }
        
       
