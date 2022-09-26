package java_revision.function_overloading;

import java_revision.function_overloading.AllFunctions;

public class Executor
{
    public static void main(String [] args)
    {
        AllFunctions object1 = new AllFunctions();
        System.out.println("Sum 1 : "+object1.sum(10,20));
        System.out.println("Sum 2 : "+object1.sum(10,20,30));
        System.out.println("Sum 3 : "+object1.sum(10.300,20.3525,83.43498));
        System.out.println("Sum 4 : "+object1.sum(25.5259,850.323));
    }


}
