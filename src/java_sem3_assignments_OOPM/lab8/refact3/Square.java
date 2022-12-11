package java_sem3_assignments_OOPM.lab8.refact3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Square implements Runnable
{
    Square()
    {
        new Thread(this,"sq").start();
    }

    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                File Obj = new File("src/java_sem3_assignments_OOPM/lab8/refact3/new2.txt");
                Scanner Reader = new Scanner(Obj);
                while (Reader.hasNextLine())
                {
                    String data = Reader.nextLine();
                    int int_data = Integer.parseInt(data);
                    if(int_data%2 == 0)
                    {
                        System.out.println("Even number : "+int_data);
                        System.out.println("Square of Even number : "+(int_data*int_data));
                    }

                }

                Reader.close();

            }

            catch (FileNotFoundException e)
            {
                System.out.println("An error has occurred.");
                e.printStackTrace();
            }

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
