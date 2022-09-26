package test_concepts.jagged_arrays;

import java.util.Scanner;

public class IterateJaggedArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] jagged_array1 = new int[4][];
        int i,j;

        System.out.println("Creating 4 rows");
        jagged_array1[0] = new int[2];
        jagged_array1[1] = new int[4];
        jagged_array1[2] = new int[2];
        jagged_array1[3] = new int[3];

        for(i=0;i<jagged_array1.length;i++)
        {
            for(j=0;j<jagged_array1[i].length;j++)
            {
                System.out.println("Enter value of "+i+"th row and "+j+"th column");
                jagged_array1[i][j] = sc.nextInt();
            }
        }

        for(i=0;i<jagged_array1.length;i++)
        {
            for(j=0;j<jagged_array1[i].length;j++)
            {
                System.out.print("jagged_array1["+i+"]["+j+"] = "+jagged_array1[i][j]+"\t\t\t");
            }
            System.out.println();
        }

    }
}
