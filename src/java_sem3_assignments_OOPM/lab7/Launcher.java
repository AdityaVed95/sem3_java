package java_sem3_assignments_OOPM.lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;

public class Launcher
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, TimeException
    {
        System.out.println("Inputting the Value of time : ");
        System.out.println("Eg : for 8 minutes and 30 seconds  ==> enter this ==> 8 : 30");
        System.out.println("Enter the value of time 1");
        String time1_input = br.readLine();

        System.out.println("Enter the value of time 2");
        String time2_input = br.readLine();

        String time1[] = time1_input.split(":");
        String time1_min_string = time1[0];
        time1_min_string = time1_min_string.trim();
        int time1_min = Integer.parseInt(time1_min_string);

        String time1_sec_string = time1[1];
        time1_sec_string = time1_sec_string.trim();
        int time1_sec = Integer.parseInt(time1_sec_string);


        String time2[] = time2_input.split(":");
        String time2_min_string = time2[0];
        time2_min_string = time2_min_string.trim();
        int time2_min = Integer.parseInt(time2_min_string);

        String time2_sec_string = time2[1];
        time2_sec_string = time2_sec_string.trim();
        int time2_sec = Integer.parseInt(time2_sec_string);

        try
        {
            if(time1_sec+time2_sec > 60)
            {
                throw new TimeException("Seconds exceeded 60 sec");
            }

            System.out.println("The input is valid and no exception occurred !!");
            System.out.println("Total time is ::  "+(time1_min+time2_min)+" : "+(time1_sec+time2_sec));

        }

        catch(TimeException e)
        {
            System.out.println("User Defined Exception occurred : "+e);
        }

        finally
        {
            System.out.println("The program terminates here !!!");
        }



    }



}
