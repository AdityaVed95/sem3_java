package practice.multithreading.onscreen.bank.part2;

public class ThreadForDeposit implements Runnable
{
    int amt_to_deposit;

    ThreadForDeposit(int amt_to_deposit)
    {
        this.amt_to_deposit = amt_to_deposit;
        new Thread(this,"d").start();
    }

    @Override
    public void run()
    {
        Bank.withdraw(amt_to_deposit);
    }
}
