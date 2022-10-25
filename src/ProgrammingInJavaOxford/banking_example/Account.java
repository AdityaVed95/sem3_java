package ProgrammingInJavaOxford.banking_example;

public abstract class Account
{
    float balance;
    private String accountNo;

    Account(float balance, String accountNo)
    {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    float getBalance()
    {
        return balance;
    }

    void setBalance(float balance)
    {
        this.balance = balance;
    }

    String getAccountNo()
    {
        return accountNo;
    }

    void setAccountNo(String acc)
    {
        accountNo = acc;
    }

    void display()
    {
        System.out.println("Acc No : "+accountNo);
        System.out.println("Balance : "+balance);
    }
}
