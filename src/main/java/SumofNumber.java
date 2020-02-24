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
public class SumofNumber {
    public static void main(String[] args) {
   System.out.println("Enter a positive nonzero integer value: ");  
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0;
    for(int i = 0;i <= n; i++)
    {  sum=sum+i;
    }
 System.out.println("Sum is " + sum);
    }
}
