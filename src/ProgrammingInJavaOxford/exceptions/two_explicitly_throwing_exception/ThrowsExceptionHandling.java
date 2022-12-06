package ProgrammingInJavaOxford.exceptions.two_explicitly_throwing_exception;

public class ThrowsExceptionHandling
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread.sleep(3000);
        System.out.println("Hello There");
        // try to remove throws InterruptedException and observe
        // the compile time error

    }
}
