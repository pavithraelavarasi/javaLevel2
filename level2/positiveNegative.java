//1. Write a Java program to get a number from the user and print whether it is positive or negative. 

import java.util.Scanner;
public class PositiveNegative {
	public static void main (String args[])
   {
       // int num = 35;
       int num;
       Scanner sc = new Scanner (System.in);
       System.out.println ("Enter a number:");
       num = sc.nextInt();
	if (num > 0)
     {
        System.out.println ("The number is Postive");
     }
        else if (num < 0)
     {
        System.out.println ("The number is Negative");
     }
        else
     {
       System.out.println ("The number is zero");
     }
   }
}

