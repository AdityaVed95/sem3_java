package test_concepts.conditional_branching;

public class BreakWithLabel
{
    public static void main(String[] args)
    {
        int i =10;
        int j = 5;
        int k;

        hello :
        while(true)
        {
            for(k = 1; k<=10; k++)
            {
                if (k==2)
                {
                    break hello;
                }
            }

            System.out.println(k);
        }

        System.out.println("out of infinity");
    }

}
