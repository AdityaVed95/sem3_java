package java_sem3_assignments_OOPM.lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launcher
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        EmployeeHandler handler1 = new EmployeeHandler();
        System.out.println("Creating a Vector of Employee Objects ");
        handler1.create();

        while(true)
        {
            System.out.println("Enter 1 to Insert an employee in the Vector");
            System.out.println("Enter 2 to Delete an employee on the basis of Employee Name");
            System.out.println("Enter 3 to Delete an employee on the basis of Employee ID");
            System.out.println("Enter 4 to Display the elements of the Vector");
            System.out.println("Enter 5 to exit the program");
            String response;
            response = br.readLine();

            if(response.equals("1"))
            {
                handler1.insert();
            }

            else if(response.equals("2"))
            {
                System.out.println("Enter the name of the employee which is to be deleted");
                String name = br.readLine();
                handler1.deleteByEName(name);
            }

            else if(response.equals("3"))
            {
                System.out.println("Enter the ID of the employee which is to be deleted");
                String id = br.readLine();
                handler1.deleteByEID(id);

            }

            else if(response.equals("4"))
            {
                handler1.displayVector();
            }

            else if(response.equals("5"))
            {
                break;
            }

            else
            {
                System.out.println("Invalid input, Please Try again");
            }

        }


    }
}
