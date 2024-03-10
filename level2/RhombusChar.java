/*26. Write a Java program to display the following character rhombus structure.

Test Data
Input the number: 7

Expected Output :

A
ABA
ABCBA
ABCDCBA
ABCDEDCBA
ABCDEFEDCBA
ABCDEFGFEDCBA
ABCDEFEDCBA
ABCDEDCBA
ABCDCBA
ABCBA
ABA
A
*/
import java.util.Scanner;

public class RhombusChar {
	public static void main(String[] args)
	{
		int i, j, n, space;
		int count = 1;
		int noOfSpace = 1;
		char c = 'A';

		Scanner scan = new Scanner(System.in);
		System.out.println("Input the number: ");
		n = scan.nextInt();

		for(i = 1; i < (n * 2); i++)
		{
			/*for(space = n - noOfSpace; space > 0; space--)
			{
				System.out.print(" ");
			}
			if (i < n)
			{
				noOfSpace++;
			}
			else
			{
				noOfSpace--;
			}*/
			for(j = 0; j < count; j++)
			{
				System.out.print(c);
				if (j < count / 2)
				{
					c++;
				}
				else
				{
					c--;
				}
			}
			if (i < n)
			{
				count = count + 2;
			}
			else
			{
				count = count - 2;
			}
			c = 'A';
			System.out.println();
		}												
	}
}
