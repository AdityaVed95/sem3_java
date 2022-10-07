package java_sem3_assignments_OOPM.lab4_refact1;

public class Customer
{
    private String accountId;
    private String name;
    private double balance;

    public Customer(String accountId, String name, double balance)
    {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public void displayAccountDetails()
    {
        System.out.println("Customer details are : ");
        System.out.println("Account id = "+this.accountId);
        System.out.println("Name = "+this.name);
        System.out.println("Balance  = "+this.balance);

    }

    // getter methods
    public String getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
