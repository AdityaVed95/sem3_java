package test_concepts.inheritance_abstract_classes.shapes;

import test_concepts.inheritance_abstract_classes.Students_test.Toppers;

public class Launcher
{
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle(2,"t1",5,7);
        t1.Area();
//        Rectangle r1 = new Rectangle(4,"r1",10,20);

        Cuboid c1 = new Cuboid(8,"c1",10,20,30);
        c1.volume();

        // we can create a non-abstract method inside an abstract class but that
        // is not a good programming practice

        // thus creating Rectangle class as abstract is not a good idea

        Toppers top1 = new Toppers();
        top1.toppers();

    }
}
