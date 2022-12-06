package ProgrammingInJavaOxford.exceptions.four_try_with_resources;

public class ClassB implements AutoCloseable
{
    @Override
    public void close() throws Exception
    {
        System.out.println("in close method of ClassB");
    }
}
