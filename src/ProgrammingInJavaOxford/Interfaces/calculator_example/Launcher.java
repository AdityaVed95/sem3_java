package ProgrammingInJavaOxford.Interfaces.calculator_example;

public class Launcher
{
    public static void main(String[] args)
    {
        NormalCalculator nc1 = new NormalCalculator();
        System.out.println("Add : "+nc1.add(10,20.4443));
        System.out.println("subtract : "+nc1.subtract(10,20.4443));
        System.out.println("multiply : "+nc1.multiply(10,20.4443));
        System.out.println("divide : "+nc1.divide(10,20.4443));

    }
}
