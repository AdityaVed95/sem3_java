package HeadFirstOOAD.chp1.airplane_ex2.case2;

public class PlaneLauncher2
{
    public static void main(String[] args)
    {
        Airplane2 airplane2 = new Airplane2();
        airplane2.speed = 100; // no need to use setSpeed
        System.out.println("Speed is : "+airplane2.speed); // no need to use getSpeed

    }
}
