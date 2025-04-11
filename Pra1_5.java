import java.util.*;
class Pra1_5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int m1[][]=new int[2][2];
		int m2[][]=new int[2][2];
		int res[][]=new int[2][2];
		int ch,n;

		System.out.print("Enter the element for matrix1 ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}

		System.out.print("\nEnter the element for matrix2 ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}

		System.out.println("\nMatrix 1:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("\nMatrix 2:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
	

		System.out.println("\n1.Addition\n2.Multiplication \n3.Transpose");

		do
		{
		System.out.print("Enter choice:");
		ch=sc.nextInt();

		switch(ch)
		{

			case 1:
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						res[i][j]=m1[i][j]+m2[i][j];
						
					}
				}
				System.out.println("Addition of matrix:");
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.print(res[i][j]+" ");
					}
					System.out.println();
				}
				break;

			case 2:
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						res[i][j]=m1[i][j]*m2[i][j];
						
					}
				}
				System.out.println("Multiplication of matrix:");
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.print(res[i][j]+" ");
					}
					System.out.println();

				}
				break;

			case 3:
				System.out.println("Transpose of matrix 1");
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.print(m1[j][i]+" ");
					}
					System.out.println();
				}
				break;

			default:
				System.out.println("Invalid Choice");

		}

		System.out.println("Click '1' for next operation and '0' for exit");
		n=sc.nextInt();
	}while(n==1);

	}
}

