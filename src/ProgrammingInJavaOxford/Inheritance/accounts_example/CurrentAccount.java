package ProgrammingInJavaOxford.Inheritance.accounts_example;

public class CurrentAccount extends Accounts
{
   int overDraftLimit;

    public CurrentAccount(double balance, String accountNumber, String accountHoldersName, String address, int overDraftLimit)
    {
        super(balance, accountNumber, accountHoldersName, address);
        this.overDraftLimit = overDraftLimit;

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


    public void display()
    {
        super.display();
        System.out.println("Over Draft limit is : "+overDraftLimit);
    }
}
