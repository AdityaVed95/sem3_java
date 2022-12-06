package ProgrammingInJavaOxford.exceptions.four_try_with_resources;

public class ClassA implements AutoCloseable
{
    @Override
    public void close() throws Exception
    {
        System.out.println("in close method of ClassA");
    }
}
