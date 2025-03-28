abstract class Shape
{
	double dim1;
	double dim2;

	Shape(double dim1,double dim2)
	{
		this.dim1=dim1;
		this.dim2=dim2;
	}	
	abstract double area();
}
class Rectangle extends Shape
{
	Rectangle(double l,double b)
	{
		super(l,b);
	}

	double area()
	{
		return dim1*dim2;
	}
}
class Triangle extends Shape
{
	Triangle(double base,double h)
	{
		super(base,h);
	}

	double area()
	{
		return 0.5*dim1*dim2;
	}
}

class Pra3_3
{
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle(10,20);
		Triangle t1=new Triangle(10,50);

		System.out.println("Area of Retangle :"+r1.area());
		System.out.println("Area of Triangle :"+t1.area());
	}
}