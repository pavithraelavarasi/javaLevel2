//12. Write a program in Java to input 5 numbers from keyboard and find their sum and average. 

import java.util.Scanner;
public class SumAndAverage {
 public static void main (String args[])
 {
   int num,i;
   double average;
   int sum = 0;
   {
     System.out.println ("Enter 5 numbers : ");
   }
      for (i=1;i<=5;i++)
      {
	Scanner sc = new Scanner (System.in);
	num = sc.nextInt();
	sum+=num;
      }
     average = sum/5;
     System.out.println ("The sum of 5 number is -" + " " + sum+" "+ "and The average is -" + " "+ average);
  }
} 

