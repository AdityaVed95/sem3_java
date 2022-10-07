package test_concepts.strings.string_manipulation;

public class Test1
{
    public static void main(String[] args)
    {
        String x = "Hello World"; // here x is a string object reffering to a location in the memory
        System.out.println(x);


        x = x + " I am here";
        // now x is still a string object, but now it is reffering to a new location in the memory

        // the above line is equivalent to the below line, the below line
        // shows what happens internally
//        x = new StringBuffer().append(x).append(" I am here").toString();

        StringBuffer q = new StringBuffer(x);
        q.append(" I am here");

        System.out.println(x);

        System.out.println("index of \" i\" in String x is: ");

        char c1 = 'h';



    }
}
