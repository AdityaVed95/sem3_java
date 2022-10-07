package test_concepts.collection_frameworks;

import java.util.*;
import java.io.*;

public class ArrayListImplementation
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter elements of Array List :");
        ArrayList <Integer> arrayList1 = new ArrayList<Integer>();
        // above line is same as this line : ArrayList <Integer> arrayList1 = new ArrayList<>();
        int n=2;
        for (int i = 0 ; i < n ; i++)
        {
            String s1 = br.readLine();
            Integer x = Integer.parseInt(s1);
            arrayList1.add(i,x);
        }

//        for(int i=0;i<n;i++)
//        {
//            System.out.println(arrayList1.get(i));
//        }

        for(int i=0;i<n;i++)
        {
            int x = arrayList1.get(i);
            System.out.println(x);
        }
    }
}
