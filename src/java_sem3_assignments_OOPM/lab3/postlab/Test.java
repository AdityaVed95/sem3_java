package java_sem3_assignments_OOPM.lab3.postlab;

public class Test
{
    public static void main(String[] args)
    {
        int[][] first_2d_array = new int [3][];
        first_2d_array[0] = new int [4];
        first_2d_array[1] = new int [3];
        first_2d_array[2] = new int [2];

        int [] [] second_2d_array = new int [2][];
        second_2d_array[0] = new int [3];
        second_2d_array[1] = new int [4];

        int [] [] [] final_jagged = new int [2] [][];
        final_jagged[0] = first_2d_array;
        final_jagged[1] = second_2d_array;

    }
}
