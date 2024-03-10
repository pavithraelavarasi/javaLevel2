//20. Write a program in Java to print the Floyd's Triangle. 

public class ZeroOnePattern {
 public static void main (String args[])
 { int row =5;
   for(int i=1;i<=row;i++)
   {
    for (int j=1;j<=i;j++)
    {
      if(j%2==0)
      {
        System.out.print ("0");
      }
      else
      {
        System.out.print ("1");
      }
    }
      System.out.println (" ");
   }
 } 
}
