package java_sem3_assignments_OOPM.lab4_refact1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launcher
{


    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the MAX number of Customers : ");
        String max = br.readLine();
        int max_number_of_customers = Integer.parseInt(max);

        CustomerAccountsHandler handler1 = new CustomerAccountsHandler(max_number_of_customers);

        int dummy = 1;
        while (dummy == 1)
        {
            System.out.println("Enter 1 to add an account");
            System.out.println("Enter 2 to Delete an existing account");
            System.out.println("Enter 3 to Display Account Details of a particular account");
            System.out.println("Enter 4 to Exit the program");

            int response;
            String res = br.readLine();
            response = Integer.parseInt(res);

            if (response == 1)
            {
                handler1.addAccount();
            }

            else if(response == 2)
            {
                handler1.delete_existing_account();
            }

            else if (response == 3)
            {
                handler1.search_verify_and_display();
            }

            else if (response == 4)
            {
                break;
            }

            else
            {
                System.out.println("Invalid Input, Please try again");
            }

        }


    }
}
