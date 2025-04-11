
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }


    public void balanceEnquiry() {
        System.out.printf("Current Balance: $%.2f%n", balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit a negative amount.");
        }
        balance += amount;
        System.out.printf("Deposited: $%.2f%n", amount);
    }


    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw a negative amount.");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.printf("Withdrawn: $%.2f%n", amount);
    }
}


public class pra6_1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);

        try {
            account.balanceEnquiry();

            account.deposit(200);  
            account.withdraw(100); 

            account.deposit(-50);   
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(700);  
        } catch (NegativeNumberException | LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        account.balanceEnquiry();
    }
}
