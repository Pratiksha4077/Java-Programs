import java.util.*;
class Student
{
	public int rollno;
	Student(int rl)
	{
		this.rollno=rl;
	}	
}
class Test extends Student
{
	public int sub1,sub2;
	Test(int rl,int s1,int s2)
	{
		super(rl);
		this.sub1=s1;
		this.sub2=s2;
	}
}
class Result extends Test
{
	Result(int roll,int m1,int m2)
	{
		super(roll,m1,m2);
		
	}

	int returnroll()
	{
		return rollno;
	}
	double calculateResult()
	{
		return this.sub1+this.sub2;
	}
}

class Pra3_4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll Number of Student :");
		int rl=sc.nextInt();

		System.out.println("Enter marks of 2 Subjects out of 10:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		
		Result r=new Result(rl,m1,m2);
		System.out.println("Roll no. is :"+r.returnroll());
		System.out.println("Total Marks :"+r.calculateResult());
	}
}