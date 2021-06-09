import java.util.Scanner;
class javaprgm4
{
	public static void main(String args[])
	{
		int r,c,i,j;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of matrix:");
		r=obj.nextInt();
		c=obj.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int sum[][]=new int[r][c];
		System.out.println("Enter the elements of first matrix:");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("Enter the elements of second matrix:");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]=obj.nextInt();
			}
		}
		System.out.println("sum of entered matrix:");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println("");
		}
	}
		
}