//31. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise. 

import java.util.Scanner;
public class IncreasingDecreasing {
 public static void main (String args[])
 { 
  Scanner sc = new Scanner (System.in);
  System.out.println ("Input first number");
  int x = sc.nextInt();
  System.out.println ("Input second number");
  int y = sc.nextInt();
  System.out.println ("Input third number");
  int z = sc.nextInt();
   if (x < y && y < z)
   {
    System.out.println ("Increasing order");
   }
   else if (x >y && y > z)
   {
    System.out.println ("Decreasing order");
   }
   else 
   {
    System.out.println("Neither increasing or decreasing order");
   }
 }
} 


