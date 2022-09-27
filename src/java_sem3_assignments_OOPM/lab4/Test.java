package java_sem3_assignments_OOPM.lab4;

import static java_sem3_assignments_OOPM.lab4.Launcher.verify_existence_of_account_and_return_position;

public class Test
{
    public static void main(String[] args)
    {
        Customer customerArr [] = new Customer [2];

        customerArr[0] = new Customer("id1","name1",1000);
        customerArr[1]= new Customer("id2","name2",2000);

        int res = verify_existence_of_account_and_return_position(customerArr,"id41");
        System.out.println(res);


    }
}
