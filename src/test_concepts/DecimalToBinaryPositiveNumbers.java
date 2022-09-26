package test_concepts;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;


// this program will give the binary number considering we
// are dealing with signed number system
// if you are dealing with unsigned number system then this code
// will give the representation of the same number but will
// occupy an extra bit to signify the sign of the number
// thus if we are thinking of dealing with unsigned binary
// system numbers then dont use this approach


public class DecimalToBinaryPositiveNumbers
{
    public static void main(String [] args)
    {
//        int ans;
//        int x = 1,y=2;
//        ans = x/y; // ans is 5
//        ans = x/y;
//        System.out.println("ans is  : "+ans);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number which is to be converted to binary number");
        double input_number;
        input_number = sc.nextDouble();



        int integer_part_number = (int) input_number;
        double decimal_part_number = input_number - integer_part_number;

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
            quotient = integer_part_number/2;
            remainder = integer_part_number%2;
            temp_remainder = String.valueOf(remainder); // string value of the

            ll_integer_part.add(temp_remainder);

            if(quotient == 0)
            {
                break;
            }
            integer_part_number = quotient;

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

        System.out.println("Final integer part is :"+binary_integer_final);

        LinkedList<String> ll2_decimal_part = new LinkedList<>();



        double number_after_decimal_point;
        int number_before_decimal_point;

        double ans_number;

        String temp1;


        while(dummy == 1)
        {
            ans_number = decimal_part_number*2;
            number_before_decimal_point = (int) ans_number;
            number_after_decimal_point = ans_number - number_before_decimal_point;
            ll2_decimal_part.add(String.valueOf(number_before_decimal_point));

            if(number_after_decimal_point == 0)
            {
                break;
            }

//            decimal_part_number = ans_number;
            decimal_part_number = number_after_decimal_point;
        }

        String decimal_final="";

        for(i=0;i<ll2_decimal_part.size();i++)
        {
            decimal_final = decimal_final+ll2_decimal_part.get(i);
        }

        System.out.println("Final decimal part is : "+decimal_final);

        System.out.println("");
        System.out.println("The final number in binary form is : "+binary_integer_final+"."+decimal_final);

        ll_integer_part.clear();
        ll2_decimal_part.clear();

    }
}
