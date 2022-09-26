package HeadFirstOOAD.chp1.airplane_ex2;

public class JetLauncher
{
    public static void main(String[] args)
    {

        Jet jet1 = new Jet();
        jet1.setSpeed(400);
        int s1 = jet1.getSpeed();
        System.out.println("Speed is : "+s1);
        jet1.accelerate();
        int s2 = jet1.getSpeed();
        System.out.println("Speed is : "+s2);

    }
}
