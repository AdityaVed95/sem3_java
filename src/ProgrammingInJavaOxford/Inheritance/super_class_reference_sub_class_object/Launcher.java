package ProgrammingInJavaOxford.Inheritance.super_class_reference_sub_class_object;

public class Launcher
{
    public static void main(String[] args)
    {
        Super1[] superObj1Array = new Super1[2];

        // super class reference variable can be assigned to a sub class object
        // eg : SuperClass obj1 = new SubClass();
        superObj1Array[0] = new Sub1();
        superObj1Array[1] = new Sub2();

        // in the above case : the methods of sub class override in overrding and the variables
        // of the super class override in overriding.


        // method1:
        for(Super1 element1 : superObj1Array)
        {
            element1.display();
        }

        // method2:
        for(int i=0;i<2;i++)
        {
            superObj1Array[i].display();

        }

        // instance variables and class variables of the super class can only be accessed :

        System.out.println(superObj1Array[0].instanceVariable);
        System.out.println(superObj1Array[0].classVariable);

        // the below two lines generates an error
        // System.out.println(superObj1Array[0].dummy);
        // superObj1Array[0].sub1Method();

        //  VIMP :
        // thus in these cases we cannot access the additional variables and methods of the sub class
        // we can only access the variables of super class and the overriden methods of the sub class

        System.out.println(superObj1Array[1].instanceVariable);
        System.out.println(superObj1Array[1].classVariable);

        Sub1 sub1Object = new Sub1();
        System.out.println(sub1Object.instanceVariable);
        System.out.println(sub1Object.classVariable);

    }
}
