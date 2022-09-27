package java_sem3_assignments_OOPM.lab3.postlab;

import java.util.Scanner;

public class Question3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of rows");

        int rows = sc.nextInt();
        int i,j;

        int [] [] jagged_array = new int [rows] [];

        for(i=0;i<jagged_array.length;i++)
        {
            int temp_columns = i+1;
            jagged_array[i] = new int [temp_columns];

        }

        System.out.println("Jagged Array with ith row having i columns is :");

        for(i=0;i<jagged_array.length;i++)
        {
            for(j=0;j<jagged_array[i].length;j++)
            {
                System.out.print(jagged_array[i][j]+"\t");
            }
            System.out.println("\n");
        }

    }
}
