//11. Write a program in Java to display n terms of natural numbers and their sum. 

import java.util.Scanner;
 public class TermsOfNaturalNo {
  public static void main (String args[])
  { int i;
    int sum = 0;
    Scanner sc = new Scanner (System.in);
    System.out.println ("Input a Number : ");
    int num=sc.nextInt();
    System.out.println ("The first n natural numbers are:"+num);
      for (i=1;i<=num;i++)
      { System.out.println (i);
	sum+=i;
      }
    System.out.println ("The sum of n natural numbers upto  " + num + " terms" + " " + sum);
  }
}  
