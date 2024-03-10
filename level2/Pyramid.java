//19. Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row. 

public class Pyramid {
 public static void main (String args[])
 { int count =1;
   for (int i =1;i<=4;i++)
   {
     for (int j =1;j<=i;j++,count++)
     System.out.print (count + " ");
     System.out.println (" ");
   }
 }
}
