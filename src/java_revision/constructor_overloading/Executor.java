package java_revision.constructor_overloading;

import java_revision.constructor_overloading.Person;

public class Executor
{
    public static void main(String [] args)
    {
        Person P1 = new Person();
        Person P2 = new Person(20,"Aditya", 63.43f);
        Person P3 = new Person(35,"Kevin");
        // When representing a float data type in Java,
        // we should append the letter f to the end of the
        // data type; otherwise it will save as double.

        P1.displayValues();
        P2.displayValues();
        P3.displayValues();

        P1.Type = "Mammal";
        // static variable and class variables are the same thing in java
        // they mean that they are the variables which are commonly
        // shared by all the objects of that class
        // even if one object changes it, then that variable will
        // change for all objects
        // it is not a good practice to change the static variable
        // from an object
        // better it is to change using the class name
        // here : Person.Type = "Mammal"
        P1.displayValues();
        P2.displayValues();
        P3.displayValues();


    }

}
