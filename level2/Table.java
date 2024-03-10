//14. Write a program in Java to display the multiplication table of a given integer. 

import java.util.Scanner;
public class Table {
 public static void main (String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println ("Input the number (Table to be calculated) :");
   int n = sc.nextInt();
   System.out.println ("Input number of terms");
   int num = sc.nextInt();
   int i;
    for (i=1;i<=num;i++)
    {
     System.out.println (i + "X" + n + "=" + n*i);
    }
  }
}
