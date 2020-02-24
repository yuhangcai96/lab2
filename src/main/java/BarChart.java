import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class BarChart {
    public static void main(String[] args) {
int sales1, sales2, sales3, sales4, sales5;
        Scanner keyboard=new Scanner(System.in);  
        System.out.print("Enter today's sales for store 1: ");
        sales1=keyboard.nextInt();
        System.out.print("Enter today's sales for store 2: ");
        sales2=keyboard.nextInt();
        System.out.print("Enter today's sales for store 3: ");
        sales3=keyboard.nextInt();
        System.out.print("Enter today's sales for store 4: ");
        sales4=keyboard.nextInt();
        System.out.print("Enter today's sales for store 5: ");
        sales5=keyboard.nextInt();
        
System.out.print("SALES BAR CHART ");
System.out.println();
        
System.out.print("Store1: ");    
for (int i=0; i<sales1; i+=100)
   {System.out.print("*");}
    System.out.println();

System.out.print("Store2: ");
for (int i=0; i<sales2; i+=100)
   {System.out.print("*");}
    System.out.println();

 System.out.print("Store3: ");
for (int i=0; i<sales3; i+=100)
   {System.out.print("*");}
   System.out.println();
 
System.out.print("Store4: ");
for (int i=0; i<sales4; i+=100)
    {System.out.print("*");}
    System.out.println();
    
System.out.print("Store5: "); 
for (int i=0; i<sales5; i+=100)
    { System.out.print("*");}
    System.out.println();}
}
