package java_sem3_assignments_OOPM.lab8;

public class Launcher
{
    public static void main(String[] args)
    {
        Carrier carrier = new Carrier();
        new RandomGenerate(carrier);
        new SquareCalculate(carrier);
        new CubeCalculate(carrier);

    }

}
