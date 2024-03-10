/*
20. Write a program in Java to print the Floyd's Triangle. 

Test Data

Input number of rows : 5 

Expected Output :

1                                                                                
01                                                                               
101                                                                              
0101                                                                            
10101
*/
import java.util.Scanner;
public class FloydsTriangle
{
	public static void main(String[] args)
	{
		int i, j, n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number of rows : ");
		n = scan.nextInt();
		
		for (i=1; i<=n; i++)
		{
			for (j=1; j<=i; j++)
			{
				if((i+j) % 2 == 0)
				{
					System.out.print("1");
				}
				else 
				{
					System.out.print("0");
				}
			}
			System.out.println("");
		}
	}
}
