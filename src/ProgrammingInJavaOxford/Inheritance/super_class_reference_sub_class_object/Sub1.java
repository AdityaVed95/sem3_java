package ProgrammingInJavaOxford.Inheritance.super_class_reference_sub_class_object;

public class Sub1 extends Super1
{
    int instanceVariable = 15;
    static int classVariable = 20;
    int dummy = 19;

    public void display()
    {
        System.out.println("in sub1");
    }

    public void sub1Method()
    {
        System.out.println("in sub 1 method");
    }
}
