//22. Write a Java program to display Pascal's triangle. 

class Pascal {
	public static void main(String args[])
	{
		int n=5;
		for(int i =0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			int num =1;
			for(int k=0;k<=i;k++)
			{
				System.out.print(num + " ");
				num = num *(i-k)/(k+1);
			}
			System.out.println();
		}
	}
}
