/*13. Write a program in Java to display the cube of the number upto given an integer. 

Test Data

Input number of terms : 4
*/

import java.util.Scanner;
public class CubeOfNumber {
 public static void main (String arg[])
 { 
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the number of terms");
  int num = sc.nextInt();
  int i;
   for (i=1;i<=num;i++)
   {
    System.out.println ("Number is :" + " "+i+" "+ "and cube of  " + i+ " is:"+ (i*i*i));
   }
 }
}
