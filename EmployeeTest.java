class Employee
{
	String f_name;
	String l_name;
	double salary;

	Employee(String nm1,String nm2,double sal)
	{
		this.f_name=nm1;
		this.l_name=nm2;
		this.salary=(sal>0)?sal:0.0;
	}

	public String getfirstname()
	{
		return f_name;
	}

	public String getlastname()
	{
		return l_name;
	}

	public double getsalary()
	{
		return salary;
	}

	public double getYearlySalary()
	{
		return salary*12;
	}

	public void getraise()
	{
		this.salary +=this.salary*0.1;
	}
}

class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("Pratiksha","Patil",25000);
		Employee e2=new Employee("Sushant","Pati",50000);

		System.out.println(e1.getfirstname()+" "+e1.getlastname()+" "+e1.getYearlySalary());
		System.out.println(e2.getfirstname()+" "+e2.getlastname()+" "+e2.getYearlySalary());

		e1.getraise();
		e2.getraise();

		System.out.println("After 10% raise ......");
		System.out.println(e1.getfirstname()+" "+e1.getlastname()+" "+e1.getYearlySalary());
		System.out.println(e2.getfirstname()+" "+e2.getlastname()+" "+e2.getYearlySalary());


	}
}
		
	

