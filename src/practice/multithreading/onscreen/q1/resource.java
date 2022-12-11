package practice.multithreading.onscreen.q1;

public class resource
{
    synchronized public static void display(String s1)
    {
        char char_array[] = s1.toCharArray();
        for(char ch : char_array)
        {
            System.out.println(ch);
        }

    }

}
