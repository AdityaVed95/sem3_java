package ProgrammingInJavaOxford.Inheritance.accounts_example;

public class SavingsAccount extends Accounts
{
    double rateOfInterest;

    SavingsAccount(double balance, String accountNumber, String accountHoldersName, String address, double rateOfInterest)
    {
        super(balance,accountNumber,accountHoldersName,address);
        this.rateOfInterest = rateOfInterest;
        calculateAmount();
    }

    public int withdrawal(double amount)
    {
        if (balance >= amount)
        {
            balance = balance - amount;
            return 1;
        }

        else
        {
            return 0;
        }


    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void calculateAmount()
    {
        balance = balance*rateOfInterest;
    }


    public void display()
    {
        super.display();
        System.out.println("Rate of interest : "+ rateOfInterest);
    }
}

