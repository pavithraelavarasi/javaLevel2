//2. Write a Java program to solve quadratic equations (use if, else if and else). 

//For eg: x2+5x+1

import java.util.Scanner;
 public class quadraticEquations {
  public static void main (String args[])
  {  Scanner sc = new Scanner(System.in);
     System.out.println ("Input a : ");
     double a = sc.nextInt();
     System.out.println ("Input b : ");
     double b = sc.nextInt();
     System.out.println ("Input c : ");
     double c = sc.nextInt();
     double d = b *b - 4.0*a*c;
      if (d >0.0)
     {
       double root1 = (-b +Math.sqrt(d))/(2.0*a);
       double root2 = (-b -Math.sqrt(d))/(2.0*a);
       System.out.println ("The roots are" + root1 +" " + "and" + root2);
     }
      else if (d ==0)
     {
       double root1 = -b /(2*a);
       System.out.println ("The first root is " + root1);
     }
      else
     {
      System.out.println ("Roots are not real");
     }
   }
}

