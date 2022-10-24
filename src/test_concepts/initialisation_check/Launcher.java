package test_concepts.initialisation_check;

public class Launcher
{
    public static void main(String[] args)
    {
        Temp t1 = new Temp();
        System.out.println(t1.i);
        byte num1 = 10;
        byte num2 = 20;
        int sum = num1+num2;
        byte sum2 = (byte) (num1+num2);
        System.out.println(sum+"    "+sum2);
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
    }
}
