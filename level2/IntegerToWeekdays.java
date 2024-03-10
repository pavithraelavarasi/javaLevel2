//5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. 

import java.util.Scanner;
 public class IntegerToWeekdays {
  public static void main (String args[])
   { int day;
     String dayName = " ";
     Scanner sc = new Scanner (System.in);
     System.out.println ("please enter a number between 1 10 7 ");
     day = sc.nextInt();
     switch (day)
    { case 1: dayName = "It's Monday"; break;	    
      case 2: dayName = "It's Tuesday"; break;	    
      case 3: dayName = "It's Wednesday"; break;	    
      case 4: dayName = "It's Thursday"; break;	    
      case 5: dayName = "It's Friday"; break;	    
      case 6: dayName = "It's Saturday"; break;	    
      case 7: dayName = "It's Sunday"; break;
      default: System.out.println ("invalid day range");
    }
      System.out.println (dayName);
   }
}	   
