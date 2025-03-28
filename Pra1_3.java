import java.util.Arrays;
import java.util.Scanner;

public class Pra1_3
{
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	int[] no = new int[10];
        
        	System.out.println("Enter 10 numbers:");
        	for (int i = 0; i < 10; i++) 
		{
            		no[i] = sc.nextInt();
        	}
        

        	Arrays.sort(no);
        

        	System.out.println("Sorted numbers in ascending order:");
        	for (int num : no) 
		{
            		System.out.print(num + " ");
       		}
        

    	}
}