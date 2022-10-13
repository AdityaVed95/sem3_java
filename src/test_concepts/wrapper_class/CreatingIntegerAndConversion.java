package test_concepts.wrapper_class;

// this program helps us to understand how to convert one object to another :
// Eg string into Integer : using several builtin methods and also by
// using autoboxing and auto unboxing

public class CreatingIntegerAndConversion
{
    public static void main(String[] args)
    {
        // we also learn that unnecessary boxing and unboxing is not required
        // java does it internally for us

        String string1 = "-95";
        int original_val1 = -95;

        // creating Integer object:

        // converting String Object to Integer object :
        Integer obj1 = Integer.parseInt(string1);
        Integer obj2 = new Integer(string1);
        Integer obj3 = Integer.valueOf(string1);


        // converting int to Integer object :
        Integer obj4 = original_val1;
        Integer obj5 = Integer.valueOf(original_val1);
        Integer obj6 = new Integer(original_val1);




        // converting Integer object to int :
        int val2 = obj1.intValue();
        int val3 = obj1;

        // converting Integer object and int to String :
        String string2 = String.valueOf(original_val1);
        String string3 = String.valueOf(obj1);
        String string4 = Integer.toString(original_val1);
        String string5 = Integer.toUnsignedString(original_val1);
        String string6 = Integer.toBinaryString(original_val1);

        // Converting String object to int :
        int val4 = Integer.parseInt(string1);
    }
}
