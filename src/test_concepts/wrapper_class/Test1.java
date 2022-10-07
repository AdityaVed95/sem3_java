package test_concepts.wrapper_class;

import static java.lang.Double.valueOf;

public class Test1
{
    public static void main(String[] args)
    {
//        String s1 = "4.3";
//        double a = 4.3;
//        Double b = Double.parseDouble(s1);
//        double c = b.doubleValue();
//
//        Double d = new Double(a);
//        double e = d.doubleValue();
//        System.out.println(e);
//        System.out.println(d);
//
//
//        Double obj1 = a;

        int v = 95;
        String s1 = "95";
//        Integer val1 = valueOf(v);

        Integer val1 = new Integer(s1);
        Integer val2 = new Integer(v); // deprecated
        Integer val3 = Integer.parseInt(s1); // recommended
        int val4 = Integer.parseInt(s1);

        int val5 = val1.intValue();
        // the above line has same effect as this one : int val5 = val1;



        String s2 = String.valueOf(v);
        String s3 = String.valueOf(val1);

        // Integer.parseInt() can only parse a string, thus its arguments are only strings
    }
}
