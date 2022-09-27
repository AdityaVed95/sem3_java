package java_sem3_assignments_OOPM.lab4.using_buffer_reader;

import java_sem3_assignments_OOPM.lab4.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launcher {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {

        System.out.println("Enter the MAX number of Customers : ");

        String max = br.readLine();
        int max_number_of_customers = Integer.parseInt(max);
        int current_number_of_customers = 0;
        Customer[] customerArray = new Customer[max_number_of_customers];

        // max_number_of_customers = customerArray.length

        int dummy = 1;
        while (dummy == 1) {
            System.out.println("Enter 1 to add an account");
            System.out.println("Enter 2 to Delete an existing account");
            System.out.println("Enter 3 to Display Account Details of a particular account");
            System.out.println("Enter 4 to Exit the program");

            int response;
            String res = br.readLine();
            response = Integer.parseInt(res);

            if (response == 1) {
                add_account(customerArray, current_number_of_customers);
                current_number_of_customers++;
            } else if (response == 2) {
                delete_existing_account(customerArray, current_number_of_customers);
                current_number_of_customers--;
            } else if (response == 3) {
                search_verify_and_display(customerArray);
            } else if (response == 4) {
                break;
            } else {
                System.out.println("Invalid Input, Please try again");
            }

        }

    }

    public static void search_verify_and_display(Customer customerArr[]) throws IOException {

        System.out.println("Enter the account ID whose details are to be displayed");
        String input_account_id = br.readLine();
//        sc.nextLine();

        int position = verify_existence_of_account_and_return_position(customerArr, input_account_id);

        if (position == -1) {
            System.out.println("Sorry the Customer with this account ID doesnt exist , Please try again later");
            return;
        }

        System.out.println("Existence of Customer with given customer id has been verified");
        customerArr[position].displayAccountDetails();

    }

    public static void add_account(Customer customerArr[], int current_number_of_customers) throws IOException {

        if (current_number_of_customers == customerArr.length) {
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
//        sc.nextLine();

        System.out.println("Enter the Balance of the Customer");
        String bal = br.readLine();
        temp_balance = Double.parseDouble(bal);
//        sc.nextLine();

        System.out.println("Enter Name of the Customer :");
        temp_name = br.readLine();
//        sc.nextLine();
        customerArr[current_number_of_customers] = new Customer(temp_account_id, temp_name, temp_balance);


    }

    public static void delete_existing_account(Customer customerArr[], int current_number_of_customers) throws IOException {

        System.out.println("Enter the account ID whose account is to be deleted");
        String input_account_id = br.readLine();
//        sc.nextLine();

        int position = verify_existence_of_account_and_return_position(customerArr, input_account_id);

        if (position == -1) {
            System.out.println("Sorry the Customer with this account ID doesnt exist , Please try again later");
            return;
        }

        // another way can be that : if you add customers by seeing if customerArr contains NULL
        // if it contains NULL at some position then that position can be considered as vacant

        for (int i = position; i < customerArr.length; i++) {
            customerArr[i] = customerArr[i + 1];
            if (customerArr[i] == null) {
                break;
            }
        }

        System.out.println("Successfully deleted account with account id " + input_account_id);


    }

    public static int verify_existence_of_account_and_return_position(Customer customerArr[], String input_account_id) {
        // returns -1 if the account doesnt exit
        // returns the zero based index position of the account in the array if the account exists

        int flag = 0, i;
        for (i = 0; i < customerArr.length; i++)
        {
            if(customerArr[i] != null)
            {
                if ((customerArr[i].getAccountId()).equals(input_account_id)) {
                    flag = 1;
                    break;
                }
            }
            else
            {
                break;
            }

        }

        if (flag == 0) {
            return -1;
        } else {
            return i;
        }

    }


}
