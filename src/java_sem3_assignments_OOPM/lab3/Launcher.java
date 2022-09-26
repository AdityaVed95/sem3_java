package java_sem3_assignments_OOPM.lab3;
import java.util.*;

public class Launcher
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players in the team");
        int number_of_players = sc.nextInt();
        int[][] scores_in_matches = new int[number_of_players][];

        int i,j;

        for(i=0;i<scores_in_matches.length;i++)
        {
            System.out.println("For the "+(i+1)+" th player : ");
            System.out.println("Enter the number of matches played by the player");
            int num_of_matches = sc.nextInt();
            scores_in_matches[i] = new int[num_of_matches];

            for(j=0;j<scores_in_matches[i].length;j++)
            {
                System.out.println("Enter the score of the "+(j+1)+"th match of Player "+(i+1));
                int current_score = sc.nextInt();
                scores_in_matches[i][j] = current_score;

            }

        }


        System.out.println("Displaying the Players and their scores in various matches :");

        for(i=0;i<scores_in_matches.length;i++)
        {
            System.out.println("For the "+(i+1)+"th player: ");
            for(j=0;j<scores_in_matches[i].length;j++)
            {
                System.out.println("Score of match "+(j+1)+" is "+ scores_in_matches[i][j]);
            }
            System.out.println();
        }


        double[] batting_average =new double[number_of_players];

        for(i=0;i<scores_in_matches.length;i++)
        {
            double sum_of_number_of_runs=0;

            for(j=0;j<scores_in_matches[i].length;j++)
            {
                sum_of_number_of_runs = sum_of_number_of_runs + scores_in_matches[i][j];
            }

            double average;

            if(scores_in_matches[i].length == 0)
            {
                average = 0;
            }
            else
            {
                average = sum_of_number_of_runs/scores_in_matches[i].length ;
            }

            batting_average[i] = average;
        }

        System.out.println("The batting average of individual players is :");

        for(i=0;i<scores_in_matches.length;i++)
        {
            System.out.println("Player "+(i+1)+" : "+batting_average[i]);
        }

    }
}

//
//           for(j=0;j<scores_in_matches[i].length;i++)
//        {
//
//        }