/*
27. Write a Java program that reads an integer and check whether it is negative, zero, or positive. 

Test Data

Input a number: 7 

Expected Output :

Number is positive
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckPositiveNegativeOrZero
{
	public static void main(String[] args)
	{
		try
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = scan.nextInt();
		scan.close();
    		if(n > 0)
    		{
    			System.out.println("Given number is Positive");
    		}
    		else if(n < 0)
    		{
    			System.out.println("Given number is Negative");
    		}
    		else if(n == 0)
    		{
    			System.out.println("Given number is Zero");
    		}
		}catch(InputMismatchException e)
		{
			System.out.println("Error. Enter any number");
		}
	}
}
