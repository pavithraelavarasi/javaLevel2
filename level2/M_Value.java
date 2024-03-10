//4. Write a Java program to read the value of an integer m and display the value of n is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0. 

import java.util.Scanner;
public class M_Value {
  public static void main (String args[])
   { 
     Scanner sc = new Scanner (System.in);
     System.out.println ("Enter a number ");
     int m = sc.nextInt();
      if (m > 0)
     {
      System.out.println ("The value of n = 1");
     }
      else if (m==0)
     {
      System.out.println ("The value of n = 0");
     }
      else
     {
      System.out.println ("The value of n = -1");
     }
   }
}

