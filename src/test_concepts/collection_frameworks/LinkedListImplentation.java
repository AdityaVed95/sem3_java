package test_concepts.collection_frameworks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class LinkedListImplentation
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter elements of Linked List :");
        LinkedList <Integer> linkedList1 = new LinkedList <>();
        int n=2;
        for(int i = 0 ; i < n ; i++)
        {
            String s1 = br.readLine();
            Integer x = Integer.parseInt(s1);
            linkedList1.add(i,x);
        }

        for(int i : linkedList1)
        {
            System.out.println(i);
        }
    }

}
