//23. Write a java program to generate a following *'s triangle. 

public class StarPattern23 {
 public static void main (String args[])
{   int row = 10;
    for (int i =1;i<=row;i++)
   { 
    for (int j=row;j>=i;j--)
    System.out.print ("*");
    System.out.println (" ");
   }
 }
}
