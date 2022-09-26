package test_concepts.jagged_arrays;

import java.util.Scanner;

public class IterateTwoDArray
{
    public static void main(String[] args)
    {
        int[][] twoD_array1 = new int[2][3];
        Scanner sc = new Scanner(System.in);
        int i,j;

        // twoD_array1.length gives the number of rows in the array
        // twoD_array1[i].length gives the number of columns for that given row of the array

        for(i=0;i<twoD_array1.length;i++)
        {
            for(j=0;j<twoD_array1[i].length;j++)
            {
                System.out.println("Enter value of "+i+"th row and "+j+"th column");
                twoD_array1[i][j] = sc.nextInt();
            }
        }

        for(i=0;i<twoD_array1.length;i++)
        {
            for(j=0;j<twoD_array1[i].length;j++)
            {
                System.out.print("twoD_array1["+i+"]["+j+"] = "+twoD_array1[i][j]+"\t\t\t");
            }
            System.out.println();
        }
    }
}
