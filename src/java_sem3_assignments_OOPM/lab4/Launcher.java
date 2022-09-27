package java_sem3_assignments_OOPM.lab4;

import java.util.Scanner;

public class Launcher
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {


        System.out.println("Enter the number MAX number of Customers : ");
        int max_number_of_customers = sc.nextInt();
        int current_number_of_customers = 0;
        Customer []  customerArray  = new Customer [max_number_of_customers];

        // max_number_of_customers = customerArray.length

        int dummy = 1;
        while (dummy == 1)
        {
            System.out.println("Enter 1 to add an account");
            System.out.println("Enter 2 to Delete an existing account");
            System.out.println("Enter 3 to Display Account Details of a particular account");
            System.out.println("Enter 4 to Exit the program");

            int response;
            response = sc.nextInt();

            if(response == 1)
            {
                add_account(customerArray,current_number_of_customers);
                current_number_of_customers++;
            }

            else if (response == 2)
            {

            }

            else if(response == 3)
            {
                search_verify_and_display(customerArray);
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




        for(int i = 0;i<customerArray.length;i++)
        {


        }

    }

    public static void search_verify_and_display(Customer customerArr [])
    {
        System.out.println("Enter the account ID whose details are to be displayed");
        String input_account_id = sc.nextLine();
        int flag=0,i;
        for(i=0;i<customerArr.length;i++)
        {
            if( ( customerArr[i].getAccountId() ).equals(input_account_id) )
            {
                flag=1;
                break;
            }
        }

        if(flag == 0)
        {
            System.out.println("Sorry the Customer with this account ID doesnt exist , Please try again later");
            return;
        }

        System.out.println("Existence of Customer with given customer id has been verified");
        customerArr[i].displayAccountDetails();

    }

    public static void add_account(Customer customerArr[] , int current_number_of_customers)
    {
        if(current_number_of_customers == customerArr.length)
        {
            System.out.println("Sorry , you have maxed out the number of customers that can be accommodated");
            System.out.println("Please remove some customers in order to add new ones");
            return;
        }

        String temp_name;
        String temp_account_id;
        double temp_balance;
        System.out.println("For the Customer :");
        System.out.println("Enter Name of the Customer :");
        temp_name = sc.nextLine();
        System.out.println("Enter the Account ID of the Customer");
        temp_account_id = sc.nextLine();
        System.out.println("Enter the Balance of the Customer");
        temp_balance = sc.nextDouble();

        customerArr[current_number_of_customers] = new Customer(temp_account_id,temp_name,temp_balance);


    }
}
