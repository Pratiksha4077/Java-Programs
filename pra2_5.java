import java.util.*;
public class pra2_5
{
	public static void main(String[] args)
	{

		String arr[]={"Pratiksha","Shivaji","Ram","Sham","Mayur","Gita"};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		Arrays.sort(arr);
		System.out.println("After Soarting :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}


	}
}

	