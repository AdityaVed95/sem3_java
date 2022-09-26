package HeadFirstOOAD.chp1.airplane_ex2;

public class Jet extends Airplane
{
    static int MULTIPLIER = 2;

    Jet()
    {
        super(); // calling the constructor of the super class of the sub class
        // i.e calling the constructor of Airplane class

    }

    public void setSpeed(int speed)
    {
        super.setSpeed(speed*MULTIPLIER);
    }

    public void accelerate()
    {
        super.setSpeed(getSpeed()*3);
    }


}
