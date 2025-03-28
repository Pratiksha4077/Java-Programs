import java.util.Scanner;

 class Area
{
	int len,wid;

	public void setDim(int l,int w)
	{
		this.len=l;
		this.wid=w;
	}
	
	public void getArea()
	{
		System.out.println("Area of rectangle is :"+(this.len*this.wid));
	}

	public static void main(String[] args)
	{

		Area a=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Lenght :");
		int len=sc.nextInt();

		System.out.println("Enter the Width :");
		int wid=sc.nextInt();

		a.setDim(len,wid);
		a.getArea();
	}
}
