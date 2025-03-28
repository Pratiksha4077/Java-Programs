abstract class Employee
{
	String name, address,job ;
	double salary;

	public Employee(String nm,String adr,double sal,String jo)
	{
		name=nm;
		address=adr;
		salary=sal;
		job=jo;
	}

	public abstract double calculateBonus();
	public abstract String generatePerformanceReport();
	public void displayDetails() 
	{
        	System.out.println("Name: " + name);
        	System.out.println("Address: " + address);
        	System.out.println("Salary: " + salary);
        	System.out.println("Job Title: " + job);
    	}
}

class Manager extends Employee {
    private int numOfProjects;

    public Manager(String name, String address, double salary, int numOfProjects) {
        super(name, address, salary, "Manager");
        this.numOfProjects = numOfProjects;
    }

    public double calculateBonus() {
        return salary * 0.20; 
    }

    
    public String generatePerformanceReport() {
        return "Manager " + name + " successfully managed " + numOfProjects + " projects.";
    }
}

class Developer extends Employee {
    private int completedTasks;

    public Developer(String name, String address, double salary, int completedTasks) {
        super(name, address, salary, "Developer");
        this.completedTasks = completedTasks;
    }

    public double calculateBonus() {
        return salary * 0.15; 
    }


    public String generatePerformanceReport() {
        return "Developer " + name + " completed " + completedTasks + " tasks successfully.";
    }
}

class Programmer extends Employee {
    private String programmingLanguage;

    public Programmer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Programmer");
        this.programmingLanguage = programmingLanguage;
    }

    public double calculateBonus() {
        return salary * 0.10; 
    }


    public String generatePerformanceReport() {
        return "Programmer " + name + " specializes in " + programmingLanguage + " programming.";
    }
}

public class Pra3_2 {
    public static void main(String[] args) {
        Employee manager = new Manager("Mayur", "Kolhapur", 90000, 5);
        Employee developer = new Developer("Pratiksha", "Mumbai", 80000, 50);
        Employee programmer = new Programmer("Shubham", "Pune", 75000, "Java");
        
        manager.displayDetails();
        System.out.println("Bonus: " + manager.calculateBonus());
        System.out.println(manager.generatePerformanceReport());

        System.out.println();
        
        developer.displayDetails();
        System.out.println("Bonus: " + developer.calculateBonus());
        System.out.println(developer.generatePerformanceReport());
        
        System.out.println();
        
        programmer.displayDetails();
        System.out.println("Bonus: " + programmer.calculateBonus());
        System.out.println(programmer.generatePerformanceReport());
    }
}