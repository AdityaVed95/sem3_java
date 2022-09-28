package java_sem3_assignments_OOPM.lab4_refact1;

import java_sem3_assignments_OOPM.lab4.Customer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class CustomerAccountsHandler
{
    private int current_number_of_customers;
    private int max_number_of_customers;

    private Customer[] customerArray;

    CustomerAccountsHandler(int max_number_of_customers)
    {
        this.current_number_of_customers = 0;
        this.max_number_of_customers = max_number_of_customers;
        this.customerArray = new Customer[max_number_of_customers];

    }

    public void addAccount () throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (current_number_of_customers == customerArray.length)
        {
            System.out.println("Sorry , you have maxed out the number of customers that can be accommodated");
            System.out.println("Please remove some customers in order to add new ones");
            return;
        }

        String temp_name;
        String temp_account_id;
        double temp_balance;

        System.out.println("For the Customer :");
        System.out.println("Enter the Account ID of the Customer");
        temp_account_id = br.readLine();


        System.out.println("Enter the Balance of the Customer");
        String bal = br.readLine();
        temp_balance = Double.parseDouble(bal);


        System.out.println("Enter Name of the Customer :");
        temp_name = br.readLine();

        customerArray[current_number_of_customers] = new Customer(temp_account_id, temp_name, temp_balance);
        current_number_of_customers++;
    }

    public void search_verify_and_display() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the account ID whose details are to be displayed");
        String input_account_id = br.readLine();


        int position = verify_existence_of_account_and_return_position(input_account_id);

        if (position == -1) {
            System.out.println("Sorry the Customer with this account ID doesnt exist , Please try again later");
            return;
        }

        System.out.println("Existence of Customer with given customer id has been verified");
        customerArray[position].displayAccountDetails();
    }

    public int verify_existence_of_account_and_return_position(String input_account_id)
    {
        // returns -1 if the account doesnt exit
        // returns the zero based index position of the account in the array if the account exists

        int flag = 0, i;
        for (i = 0; i < customerArray.length; i++)
        {
            if(customerArray[i] != null)
            {
                if ((customerArray[i].getAccountId()).equals(input_account_id)) {
                    flag = 1;
                    break;
                }
            }
            else
            {
                break;
            }

        }

        if (flag == 0)
        {
            return -1;
        }
        else
        {
            return i;
        }
    }

    public void delete_existing_account() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the account ID whose account is to be deleted");
        String input_account_id = br.readLine();
//        sc.nextLine();

        int position = verify_existence_of_account_and_return_position(input_account_id);

        if (position == -1) {
            System.out.println("Sorry the Customer with this account ID doesnt exist , Please try again later");
            return;
        }

        // another way can be that : if you add customers by seeing if customerArr contains NULL
        // if it contains NULL at some position then that position can be considered as vacant

        for (int i = position; i < customerArray.length; i++)
        {
            customerArray[i] = customerArray[i + 1];
            if (customerArray[i] == null)
            {
                break;
            }
        }

        System.out.println("Successfully deleted account with account id " + input_account_id);
        current_number_of_customers--;

    }


}
