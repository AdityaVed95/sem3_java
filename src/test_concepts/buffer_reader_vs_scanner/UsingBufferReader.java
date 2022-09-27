package test_concepts.buffer_reader_vs_scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UsingBufferReader
{


    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int x = Integer.parseInt(line);

        String line2 = br.readLine();
        String name = line2;

        System.out.println(x);
        System.out.println(name);
    }
}
