import java.util.*;
class Student
{
	int rollno;
	void setRollNo(int rl)
	{
		this.rollno=rl;
	}

	int getRollNo()
	{
		return rollno;
	}	
}
class Test extends Student
{
	public int sub1,sub2;
	void setMarks(int s1,int s2)
	{
		this.sub1=s1;
		this.sub2=s2;
	}
	
	void getMarks()
	{
		System.out.println("Subjects 1:"+sub1);
		System.out.println("Subjects 2:"+sub2);
	}
}
interface Sports
{
	int smarks=10;
	void set();
}
class Result extends Test implements Sports
{
	private int totalMarks;

    
    	public void set() 
	{
      		  totalMarks = sub1 + sub2 + smarks;
    	}

    	public void display() 
	{
		System.out.println();
		 System.out.println("********************* STUDENT DETAILS **************************");
       		 System.out.println("Roll Number: " + rollno);
       		 getMarks();
       		 System.out.println("Sports Marks: " + smarks);
        	 System.out.println("Total Marks: " + totalMarks);
    	}
}

class Pra4_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Result rs=new Result();

		System.out.println("Enter Roll Number of Student :");
		int rl=sc.nextInt();
		rs.setRollNo(rl);

	
		System.out.print("Enter Marks for Subject 1: ");
        	int sub1 = sc.nextInt();
       		System.out.print("Enter Marks for Subject 2: ");
        	int sub2 = sc.nextInt();
        	rs.setMarks(sub1, sub2);

        	rs.set();
        	rs.display();
	}
}