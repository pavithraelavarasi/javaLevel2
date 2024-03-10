//3. Take three numbers from the user and print the greatest number. 

import java.util.Scanner;
public class greatestNumber {
  public static void main (String args[])
   { int a,b,c,num,largest;
     Scanner sc = new Scanner (System.in);
     System.out.println ("Enter the first number");
     a = sc.nextInt();
     System.out.println ("Enter the second number");
     b = sc.nextInt();
     System.out.println ("Enter the third number");
     c = sc.nextInt();
     //ternory operator condition ( cond ? if true : else)
     num = a>b?a:b;
     largest = c>num?c:num;
     System.out.println ("The largest number is " + " " + largest);
   }
}
