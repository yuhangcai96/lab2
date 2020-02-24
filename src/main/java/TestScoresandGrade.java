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
public class TestScoresandGrade {
    public static void main(String[] args)
{

float testScore1, testScore2, testScore3, averageScore;
char letterGrade;

 Scanner sc = new Scanner(System.in);
    {
     System.out.print("Enter first test score: ");
     testScore1 = sc.nextFloat();
     System.out.print("Enter second test score: ");
     testScore2 = sc.nextFloat();
     System.out.print("Enter third test score: ");
     testScore3 = sc.nextFloat();
                
    averageScore = (testScore1 + testScore2 + testScore3)/3;
    System.out.println("Average score: " + averageScore);
   
    if (averageScore >= 90 && averageScore <= 100)
    {
    letterGrade ='A';
    System.out.println("Letter grade: " + letterGrade);
    }
               
    else if (averageScore >= 80 && averageScore <= 89)
   {
    letterGrade = 'B';
    System.out.println("Letter grade: " + letterGrade);
    }
                
    else if (averageScore >= 70 && averageScore <= 79)
   {
    letterGrade = 'C';
    System.out.println("Letter grade: " + letterGrade);
    }
               
    else if (averageScore >= 60 && averageScore <= 69)
    {
    letterGrade = 'D';
    System.out.println("Letter grade: " + letterGrade);
    }
               
    else if (averageScore < 60)
    {
    letterGrade = 'F';
    System.out.println("Letter grade: " + letterGrade);
    }           
    }
}
}
