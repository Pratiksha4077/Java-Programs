public class pra2_3
{
	static int a=10;
	
	static{
		System.out.println("This is a staic block");
	}

	static void count()
	{
		a++;
		System.out.println("Count is "+a);
	}

	public static void main(String args[])
	{
		count();
		count();
	}
}

	