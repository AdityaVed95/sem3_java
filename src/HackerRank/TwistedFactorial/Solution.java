package HackerRank.TwistedFactorial;

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
//        System.out.println("Enter the value of n : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        int part1;
        Vector <Integer> v1 = new Vector<>();
        for(int i=n;i>=1; i -= 4)
        {
            if(i>=3)
            {
                part1 = ( i * (i-1) / (i-2) ) ;
                v1.add(part1);
                v1.add(i-3);
            }

            else if(i == 2)
            {
                part1 = 2;
                v1.add(part1);
            }

            else if(i == 1)
            {
                part1 = 1;
                v1.add(part1);
            }
        }
//        System.out.println(v1);

        int sum = v1.get(0);
        int flag = 0;

        for(int i=1;i<v1.size();i++)
        {
            if(flag == 0)
            {
                sum = sum + v1.get(i);
                flag = 1;
            }
            else
            {
                sum = sum - v1.get(i);
                flag = 0;
            }
        }

        System.out.println(sum);
        // /
        // 9
        // *
        // 10



    }
}
