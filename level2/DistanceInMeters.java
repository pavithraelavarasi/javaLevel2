//7. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters). 

import java.util.Scanner;
  public class DistanceInMeters {
   public static void main (String args[])
   {
       Scanner scan = new Scanner (System.in);
       float timeSeconds;
       float mps,kph,mph;
       System.out.println ("input a distance in meters : ");
       float distance = scan.nextFloat();
       System.out.println ("input hour : ");
       float hr = scan.nextFloat();
       System.out.println ("input minutes : ");
       float min = scan.nextFloat();
       System.out.println ("input seconds : ");
       float second = scan.nextFloat();
	   timeSeconds = (hr*3600)+(min*60)+second;
	   mps = distance / timeSeconds;
	   kph = (distance / 1000.0f)/(timeSeconds/3600.0f);
	   mph = kph/1.609f;
         System.out.println ("your speed in meter/second in " + mps);
	 System.out.println ("your speed in kilometer/hour in " + kph);
	 System.out.println ("your speed in miles/hour in " + mph);
   }

  }
