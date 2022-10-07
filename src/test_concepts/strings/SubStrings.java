package test_concepts.strings;

public class SubStrings
{
    public static void main(String[] args)
    {
        String original_string = "Hello there this is Aditya Ved";
        String sub_string = original_string.substring(2,7); // here zero based indices are added
        System.out.println("original string "+original_string);
        System.out.println("sub string is : "+ sub_string);
        // thus the substring created is from 2th index to 6th index only, 7th index is not included
        // you can use a String to control a switch
        // don’t use strings in a switch unnecessarily.
        // switching on strings can be less efficient than switching on integers
    }
}
