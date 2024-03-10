//18. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like : 

public class RightAngleTrianglePlus {
 public static void main (String args[])
 {
   int count =1;
   for (int i=1;i<=4;i++)
  {
   for (int j =1;j<=i;j++,count++)
   System.out.print (count + " ");
   System.out.println (" ");
  }
 }
}
