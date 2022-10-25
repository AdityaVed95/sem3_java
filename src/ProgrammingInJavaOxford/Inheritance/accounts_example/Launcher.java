package ProgrammingInJavaOxford.Inheritance.accounts_example;

public class Launcher
{
    public static void main(String[] args)
    {
        SavingsAccount savingsAccount1 = new SavingsAccount(100,"num1","nam1","add1",5);
        savingsAccount1.deposit(10);
        savingsAccount1.display();
    }
}
