package test_concepts.strings.string_manipulation;

public class StringBufferImplementation
{
    public static void main(String[] args)
    {
        StringBuffer stringBuffer1 = new StringBuffer();
        System.out.println("Empty contents :"+stringBuffer1); // empty

        System.out.println("initial capacity : "+stringBuffer1.capacity());
        stringBuffer1.append(" This is it for now ");

        System.out.println("Contents after appending: "+stringBuffer1);
        System.out.println("the capacity after appending is : "+stringBuffer1.capacity());

        // doesnt trim whitespaces
        // removes the extra characters in the buffer and makes the
        // size of the buffer = capacity of the buffer by reducing the
        // capacity of the buffer, thus making it more space efficient

        stringBuffer1.trimToSize();
        System.out.println("the capacity after trimming size is : "+stringBuffer1.capacity());
        System.out.println("Contents remains unchanged after trimming: "+stringBuffer1);


        // this reverses the original string and also the string to which it is assigned
        StringBuffer stringBuffer2 = stringBuffer1.reverse();

        System.out.println("stringBuffer2 is : "+stringBuffer2);
        System.out.println("stringBuffer1 is : "+stringBuffer1);

        System.out.println("char at 10 in stringBuffer1: "+stringBuffer1.charAt(10));
        stringBuffer1.setCharAt(10,'k');
        System.out.println("getting the character at 10 after using setCharAt: "+stringBuffer1.charAt(10));
        System.out.println("stringBuffer1 after using setCharAt : "+stringBuffer1);

        stringBuffer1.reverse();
        System.out.println("Again reversing stringBuffer1 gives : "+stringBuffer1);

        String stringBuffer3 = stringBuffer1.substring(2,7);
        System.out.println("stringBuffer3 is : "+ stringBuffer3 );
    }
}
