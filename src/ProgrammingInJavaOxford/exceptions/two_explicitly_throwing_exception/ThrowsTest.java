package ProgrammingInJavaOxford.exceptions.two_explicitly_throwing_exception;

public class ThrowsTest
{
    public static void main(String[] args) throws ArithmeticException
    {
        int x = 10/0;
        System.out.println("Hello there");
    }
}

//    Important points to remember about throws keyword:
//
//        throws keyword is required only for checked exception and usage
//        of throws keyword for unchecked exception is meaningless.

//        throws keyword is required only to convince compiler and usage
//        of throws keyword does not prevent abnormal termination of
//        program.

//        By the help of throws keyword we can provide information
//        to the caller of the method about the exception.