package ProgrammingInJavaOxford.exceptions.two_explicitly_throwing_exception;

import java.io.IOException;
// throws is used for checked exceptions more as compared to
// unchecked exceptions


public class UnderstandingThrowsPurpose
{

    public void method1() throws Exception
    {
        throw new IOException("hi");
    }
    public void method2() throws Exception
    {
        throw new ArithmeticException("hi");
    }

    // see the color difference : Exception is colored for method1() method
    // and not coloured for method2()
}
