import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class BankCharges {
    public static void main(String[] args){
{
double fee = 10;
double checkFee = 0;
String input = JOptionPane.showInputDialog("Please enter the number of checks you wrote for the month： ");
int checks = Integer.parseInt(input);
 double fee1 = 0.10;
 double fee2 = 0.08;
 double fee3 = 0.06;
 double fee4 = 0.04;
 
Scanner keyboard = new Scanner(System.in);
 int number; 
  if(checks <20)
  checkFee = (fee1);
 else if(checks >=20)
  checkFee = (fee2);
  else if(checks >= 40)
  checkFee = (fee3);
  else if(checks >= 60)
  checkFee =(fee4);
    double totalfee = (checkFee * checks+fee);
 System.out.print("Bank service Fees for the month are " + totalfee); }
 }
}
