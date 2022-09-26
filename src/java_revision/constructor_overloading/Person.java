package java_revision.constructor_overloading;

public class Person
{
    int age; // instance variable
    String name; // instance variable
    float weight;  // instance variable

    static String Type = "Human";  // static variable aka class variable


    Person()
    {
        age = 0;
        name = "";
        weight = 0;
        System.out.println("Welcome to the default constructor");
    }

    Person(int a1,String n1, float w1)
    {
        age = a1;
        name = n1;
        weight = w1;
        System.out.println("Welcome to the constructor with all the" +
                " three parameters");

    }

    Person(int a1,String n1)
    {
        age = a1;
        name = n1;
        weight = 0;
        System.out.println("Welcome to the constructor with a1 and" +
                " n1 parameters");

    }


    public void displayValues()
    {
        System.out.println("======================================");
        System.out.println("age : "+age);
        System.out.println("name : "+name);
        System.out.println("weight : "+weight);
        System.out.println("Type : "+Type);
        System.out.println("======================================");
    }

}
