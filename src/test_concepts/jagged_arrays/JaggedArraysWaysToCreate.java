package test_concepts.jagged_arrays;

public class JaggedArraysWaysToCreate
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4}; // 1D array of fixed size , memory allocated at compile time
        int[][] b = new int [4] [3]; // 2D array : memory allocated at compile time
        // what if we want to keep the number of rows constant but we dont know the number
        // of columns for a given row
        // so here we create a jagged array
        // but once we declare the number of columns for a given row in the
        // jagged array then we cannot change it , so its not completely dynamic
        // its created to make it memory efficient

        int[][] c = new int[4][];
        // here number of rows is 4 but number of columns for each row is not defined
        c[0] = new int[2];
        c[1] = new int[3];
        c[2] = new int[1];
        c[3] = new int[5];

        int[][] d = {new int [2],new int [3], new int[1], new int[5]};

        int[] e1 = new int[2];
        int[] e2 = new int[3];
        int[] e3 = new int [1];
        int[] e4 = new int[5];
        int[][] e = {e1,e2,e3,e4};






    }
}
