package ProgrammingInJavaOxford.Interfaces.variables_in_interface;

public class VariableTest implements LimitTest
{
    public void findNumberWithinLimits(int a)
    {
        if(a>LOWER_LIMIT && a<UPPER_LIMIT)
        {
            System.out.println("Variable "+ a +" lies between "+LimitTest.LOWER_LIMIT+" and "+LimitTest.UPPER_LIMIT);
        }
        else
        {
            System.out.println("Variable "+ a +" does not lie between "+LimitTest.LOWER_LIMIT+" and "+LimitTest.UPPER_LIMIT);
        }
    }

}

