package test_concepts.instance_of;

public class ParentChildTest1
{
    public static void main(String[] args)
    {


        Child cobj = new Child();

        System.out.println(cobj instanceof Child);
        System.out.println(cobj instanceof Parent);
        System.out.println(cobj instanceof Object);

        //        true
//        true
//        true

        Child cobj2 = null;
        System.out.println(cobj2 instanceof Child);
        System.out.println(cobj2 instanceof Parent);
        System.out.println(cobj2 instanceof Object);


        //        false
//        false
//        false



        ParentChildTest1 test1 = new ParentChildTest1();
        System.out.println(test1 instanceof Object); // true


        Parent p1 = new Parent();
        System.out.println(p1 instanceof Child); // false


        // the below two lines will generate error :
//        System.out.println(test1 instanceof Parent);
//        System.out.println(test1 instanceof Child);


    }
}
