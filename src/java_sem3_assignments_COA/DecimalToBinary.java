package java_sem3_assignments_COA;

// converting positive whole numbers into binary
// this program will give the binary number considering we
// are dealing with signed number system
// if you are dealing with unsigned number system then this code
// will give the representation of the same number but will
// occupy an extra bit to signify the sign of the number
// thus if we are thinking of dealing with unsigned binary
// system numbers then dont use this approach



import java.util.*;

public class DecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number which is to be converted to binary number");
        int input_number;
        input_number = sc.nextInt();


        int quotient;

        int temp_num;
        int remainder;
        int dummy =1;
        LinkedList<String> ll_integer_part = new LinkedList<String>();
        // ll_integer_part this linked list contains the binary
        // form of the integer but in reverse order of what it should be
        String temp_remainder;

        while(dummy == 1)
        {
            quotient = input_number/2;
            remainder = input_number%2;
            temp_remainder = String.valueOf(remainder); // string value of the

            ll_integer_part.add(temp_remainder);

            if(quotient == 0)
            {
                break;
            }
            input_number = quotient;

        }

        int i;
        String binary_integer_num="";
        String temp_item;
        for(i=0;i< ll_integer_part.size();i++)
        {
            temp_item = ll_integer_part.get(i);
            binary_integer_num = binary_integer_num + temp_item;
        }

        char ch;
        String binary_integer_final="";
        for(i=0;i<binary_integer_num.length();i++)
        {
            ch = binary_integer_num.charAt(i);
            binary_integer_final = ch + binary_integer_final;
        }
        binary_integer_final = "0"+binary_integer_final;
        System.out.println("Final integer part is :"+binary_integer_final);

    }


}
