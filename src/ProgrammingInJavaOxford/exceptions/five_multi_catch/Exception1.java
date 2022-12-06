package ProgrammingInJavaOxford.exceptions.five_multi_catch;

import java.io.IOException;

public class Exception1
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("in try block");
            throw new ArithmeticException("good luck");
        }
        catch(ArithmeticException | NullPointerException | NumberFormatException  e)
        {
            // if we try to add Exception to the above list , compile time error is generated  :
            // types in multi-catch must be disjoint: 'java.lang.NumberFormatException'
            // is a subclass of 'java.lang.Exception'



            if(e instanceof ArithmeticException)
                System.out.println("ArithmeticException caused : "+e);

            if(e instanceof NullPointerException)
                System.out.println("NullPointerException caused");

            if(e instanceof NumberFormatException)
                System.out.println("NumberFormatException caused");

            // e is implicitly final in multicatch block
            // thus below line does not work
//            e = null;

            // such is not the case in single catch block.


        }
    }
}
