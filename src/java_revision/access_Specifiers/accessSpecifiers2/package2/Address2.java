package java_revision.access_Specifiers.accessSpecifiers2.package2;

import java_revision.access_Specifiers.accessSpecifiers2.package1.Person2;


public class Address2
{
    public static void main(String [] args)
    {
        Person2 object = new Person2();
        object.a = 100;
        System.out.println("a is : "+object.a);
        // the below line gives error
        //object.b = 200;

    }


}