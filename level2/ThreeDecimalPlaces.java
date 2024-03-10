//6. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places. 

import java.util.Scanner;
public class ThreeDecimalPlaces {
 public static void main (String args[])
 {
   Scanner sc = new Scanner (System.in);
   System.out.println ("Enter the first floating point number");
   double num1 = sc.nextDouble();
   System.out.println ("Enter the second floating point number");
   double num2 = sc.nextDouble();
   if((num1 -num2) >=0.001)
   {
	   System.out.println("These numbers are same");
   }
   else
   {
	   System.out.println("These numbers are different");
   }
 }
}


















/*   int quo1 = num1 / 1000;
   int rem1 = num1 % 1000;
   int quo2 = num2 / 1000;
   int rem2 = num2 % 1000;
   if (quo1 == quo2 && rem1 == rem2)
  {
    System.out.println ("They are same upto three decimal number");
   }
   else
   {
    System.out.println ("They are different");
   }
  }
}*/

