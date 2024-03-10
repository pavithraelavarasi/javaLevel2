//7. Write a Java program to find the number of days in a month. 

import java.util.Scanner;
 public class NumberOfDaysInMonth {
  public static void main (String args[])
  { int DaysInMonth;
    String monthName = " ";
    Scanner sc = new Scanner (System.in);
    System.out.println ("Input a Month number");
    numOfMonth = sc.nextInt;
    System.out.println ("Input a year");
    int year = sc.nextInt;
     switch (month)
      {
	case 1 : monthName = "January";
                 DaysInMonth = 31; break;
       
	case 2 : monthName = "Feburary";
		  if ((year%4==0) && (year%100!=0) ||( year%400==0))
	           {
		    DaysInMonth = 29;
		   }
		  else
		   {
		    DaysInMonth = 28;
		   }
		  break; 
	case 3 : monthName = "March";
                 DaysInMonth = 31; break;
	case 4 : monthName = "April";
                 DaysInMonth = 30; break;
	case 5 : monthName = "May";
                 DaysInMonth = 31; break;
	case 6 : monthName = "June";
                 DaysInMonth = 30; break;
	case 7 : monthName = "July";
                 DaysInMonth = 31; break;
	case 8 : monthName = "August";
                 DaysInMonth = 31; break;
	case 9 : monthName = "September";
                 DaysInMonth = 30; break;
	case 10 : monthName = "October";
                 DaysInMonth = 31; break;
	case 11 : monthName = "November";
                 DaysInMonth = 30; break;
	case 12 : monthName = "December";
                 DaysInMonth = 31; break;
        default : System.out.println("Invalid month");
	}
     System.out.println (monthName + " " +year+ "has" + " " + DaysInMonth+ " " + "days");
  }
}
