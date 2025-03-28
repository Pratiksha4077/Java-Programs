import java.util.*;
class Pra1_1 
{
   	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to calculate the factorial ");
		int no=sc.nextInt();
        	long fact = 1; 
        	for (int i = 1; i <= no; i++) 
		{ 
            		fact *= i;
        	}

        	System.out.println("Factorial is: " + fact);
    	}
}
