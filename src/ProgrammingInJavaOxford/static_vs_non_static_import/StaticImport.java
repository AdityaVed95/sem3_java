package ProgrammingInJavaOxford.static_vs_non_static_import;

import static java.lang.Math.*;

public class StaticImport
{
    public static void main(String[] args)
    {
        // both methods work for static import
        System.out.println("max of 23 and 25 is : "+max(23,25));
        System.out.println("max of 23 and 25 is : "+Math.max(23,25));
    }
}
