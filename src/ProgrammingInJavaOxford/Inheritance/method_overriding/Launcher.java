package ProgrammingInJavaOxford.Inheritance.method_overriding;

public class Launcher
{
    public static void main(String[] args)
    {
        SubClass subClassObject1 = new SubClass();
        subClassObject1.display1(10); // this is an example of method overriding

        // the below 2 lines are not an example of method overriding.
        subClassObject1.display2(10);
        subClassObject1.display2(10,20);

        // constructor overriding never happens : the constructor of the super class of the given
        // class is always called when we instantiate an object of the sub class
        // all classes we create are by default sub class of Object class.
        // thus the constructor of Object class is called before constructor of super class is executed.
        // a call to the constructor of the super class should be the 1st line of the constructor.
        // by default  : the default constructor of the super clas is called.

    }
}
