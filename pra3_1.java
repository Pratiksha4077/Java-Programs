class BankAccount
{
	public double balance;

	public BankAccount(double bal)
	{
		balance=bal;
	}

	public void deposit(double amount) 
	{
        	balance += amount;
        	System.out.println("Deposited: " + amount);
        	System.out.println("New balance: " + balance);
    	}

    	public void withdraw(double amount) 
	{
        	if (amount > balance) 
		{
            		System.out.println("Insufficient funds");
        	} 
		else 
		{
            		balance -= amount;
            		System.out.println("Withdrew: " + amount);
            		System.out.println("New balance: " + balance);
        	}
    	}
}
class SavingAccount extends BankAccount
{

	public SavingAccount(double bal)
	{
		super(bal);
	}

	public void withdraw(double amount) 
	{
		if(balance<100)
		{
			System.out.println("Can't withdraw ");
		}
		else
		{
			super.withdraw(amount);
		}
	}
}

public class pra3_1
{
	public static void main(String args[])
	{
		SavingAccount sa=new SavingAccount(2000);

		sa.deposit(500);

		sa.withdraw(1450);
	}
}

