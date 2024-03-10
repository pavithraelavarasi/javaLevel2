//30. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise. 

import java.util.Scanner;
public class ThreeNumbers {
 public static void main (String args[])
 { 
   Scanner sc = new Scanner (System.in);
   System.out.println ("Input the first number");
   int num1 = sc.nextInt();
   System.out.println ("Input the second number");
   int num2 = sc.nextInt();
   System.out.println ("Input the third number");
   int num3 = sc.nextInt();
   if (num1==num2 && num1==num3)
    {
     System.out.println ("All numbers are equal");
    }
   else if ((num1==num2)||(num1==num3)||(num3==num2))
    {
     System.out.println ("Neither all are equal or different");
    }
   else 
    {
     System.out.println ("All numbers are different");
    }
  }
}
