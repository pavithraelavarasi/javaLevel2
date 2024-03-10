/*25. Write a Java program to display the number rhombus structure.
Test Data
Input the number: 7

Expected Output :

1
212
32123
4321234
543212345
65432123456
7654321234567
65432123456
543212345
4321234
32123
212
1
*/
import java.util.Scanner;
public class RhombusNum
{
	public static void main(String[] args)
	{
		int i, j, n, space;
		int start = 0;
		int count = 1;
		int noOfSpace = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the number: ");
		n = scan.nextInt();

		for(i = 1; i < (n * 2); i++)
		{
			for(space = n - noOfSpace; space > 0; space--)
			{
				System.out.print(" ");
			}
				if (i < n)
				{
					start = i;
					noOfSpace++;
			}
			else{
				start = n * 2 - i;
				noOfSpace--;
			}
			for(j = 0; j < count; j++)
			{
				System.out.print(start);
				if (j < count / 2)
				{
					start--;
				}
				else
				{
					start++;
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
			System.out.println();
		}
	}
}
