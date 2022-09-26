package HeadFirstOOAD.chp1.airplane_ex2;

public class PlaneLauncher
{
    public static void main(String [] args)
    {
        Airplane airplane1 = new Airplane();
        airplane1.setSpeed(100);
        int s = airplane1.getSpeed();
        System.out.println("The speed is : "+s);
    }
}

