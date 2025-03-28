interface Shape
{
	abstract double area();
}
class Rectangle implements Shape
{
	double dim1;
	double dim2;

	Rectangle(double l,double b)
	{
		this.dim1=l;
		this.dim2=b;
	}

	public double area()
	{
		return dim1*dim2;
	}
}
class Triangle implements Shape
{
	double dim1;
	double dim2;
	Triangle(double base,double h)
	{
		this.dim1=base;
		this.dim2=h;
	}

	public double area()
	{
		return 0.5*dim1*dim2;
	}
}

class Pra4_2
{
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle(10,20);
		Triangle t1=new Triangle(10,50);

		System.out.println("Area of Retangle :"+r1.area());
		System.out.println("Area of Triangle :"+t1.area());
	}
}