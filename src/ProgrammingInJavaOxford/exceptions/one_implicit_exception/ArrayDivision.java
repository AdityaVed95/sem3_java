package ProgrammingInJavaOxford.exceptions.one_implicit_exception;

public class ArrayDivision
{
    public static void main(String[] args)
    {
        int numerator [] = {10,43,3532,54352,626,53456,564};
        int denominator [] = {1,0,45,7};
        int i;
        for(i=0;i<(Math.max(numerator.length,denominator.length));i++)
        {
            try
            {
                System.out.println(numerator[i]/denominator[i]);
            }

            catch (ArithmeticException ae)
            {
                System.out.println("cant divide by zero");
            }

            catch (ArrayIndexOutOfBoundsException ae)
            {
                System.out.println("no matching elements");
            }
        }
    }
}
