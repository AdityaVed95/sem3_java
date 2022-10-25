package ProgrammingInJavaOxford.static_vs_non_static_import;

import java.lang.Math.*;

public class NonStaticImport
{
    public static void main(String[] args)
    {
        System.out.println("max of 23 and 25 is : "+Math.max(23,25));
        // the below line will generate an error as it is a non static import
        // System.out.println("max of 23 and 25 is : "+max(23,25));

        // static import allows us to directly use the static
        // fields/members (variables and methods) of a class

    }
}
