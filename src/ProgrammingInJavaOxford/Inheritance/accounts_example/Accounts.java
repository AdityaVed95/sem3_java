package ProgrammingInJavaOxford.Inheritance.accounts_example;

public abstract class Accounts
{
    double balance;
    String accountNumber;
    String accountHoldersName;
    String address;


    Accounts(double balance, String accountNumber, String accountHoldersName, String address)
    {
        this.balance = balance;
        this.accountHoldersName= accountHoldersName;
        this.accountNumber = accountNumber;
        this.address = address;
    }

    public abstract int withdrawal(double amount);

    public abstract void deposit(double amount);

    public void display()
    {
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Holder Name : "+accountHoldersName);
        System.out.println("Address : "+address);
        System.out.println("The balance is : "+balance);


    }

}
