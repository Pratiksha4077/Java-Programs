import java.util.*;
class Pra1_2 
{
   	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		boolean isPrime = true;
        	
            	if (num <= 1) {
                	System.out.println(num + " is not a prime number.");
                	
            	}

            	for (int i = 2; i * i <= num; i++) 
		{
                	if (num % i == 0) 
			{
                    		isPrime = false;
                    		break;
			}
                }
        
            	if (isPrime) 
		{
                	System.out.println(num + " is a prime number.");
            	} 
		else 
		{
                	System.out.println(num + " is not a prime number.");
            	}
        }
}

