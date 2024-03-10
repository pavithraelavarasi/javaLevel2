//20. Write a Java program to print the following grid. 

public class GridPattern {
 public static void main (String args[])
 {
    int row = 10;
    for (int i=1;i<=row;i++)
    {
     for (int j=1;j<=row;j++)
     {
     System.out.print ("-" + " ");
     }
     System.out.println (" ");
   }
 }
}
