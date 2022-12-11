package java_sem3_assignments_OOPM.lab8.refact3_assignment_main_using_file_handling;


// Import the File class

import java.io.File;

// Import this class for handling errors
import java.io.FileNotFoundException;

// Import the Scanner class to read content from text files
import java.util.Scanner;


public class Reader implements Runnable {
    Reader()
    {
        new Thread(this, "read").start();
    }

    @Override
    public void run() {


        try
        {
            File Obj = new File("src/java_sem3_assignments_OOPM/lab8/refact3/new2.txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine())
            {
                String data = Reader.nextLine();
                System.out.println(data);
            }

            Reader.close();

        }

        catch (FileNotFoundException e)
        {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}


