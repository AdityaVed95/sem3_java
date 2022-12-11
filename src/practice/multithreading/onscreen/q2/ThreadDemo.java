package practice.multithreading.onscreen.q2;

public class ThreadDemo
{
    String thread_name;
    String[] array_of_strings;

    ThreadDemo(String thread_name,int size_of_array)
    {
        this.thread_name = thread_name;
        array_of_strings = new String[size_of_array];

    }
}
