package ProgrammingInJavaOxford.multithreading.eleven_synchronise_method;

// Import the File class

import java.io.File;

// Import the IOException class to handle errors
import java.io.FileWriter;
import java.io.IOException;


public class TestSynchronise {
    synchronized public static void anyMethod(String str1)
    {

        try
        {
            FileWriter Writer = new FileWriter("src/ProgrammingInJavaOxford/multithreading/eleven_synchronise_method/myfile");
            Writer.write("Files in Java are seriously good!! "+str1);
            Writer.close();
            System.out.println("Successfully written "+str1);
        }
        catch (IOException e)
        {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }


    }
}

