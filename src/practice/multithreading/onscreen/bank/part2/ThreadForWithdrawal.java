package practice.multithreading.onscreen.bank.part2;

public class ThreadForWithdrawal implements Runnable
{
    int amt_to_withdraw;

    ThreadForWithdrawal(int amt_to_withdraw)
    {
        this.amt_to_withdraw = amt_to_withdraw;
        new Thread(this,"w").start();
    }

    @Override
    public void run()
    {
        Bank.withdraw(amt_to_withdraw);
    }

}
