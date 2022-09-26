package HeadFirstOOAD.chp1.airplane_ex2.case2;

public class Jet2 extends Airplane2
{
    static int MULTIPLIER = 2;

    public Jet2()
    {

    }
    public void setSpeed(int speed)
    {
        super.setSpeed(speed*MULTIPLIER);
    }


    // getSpeed() in subclass has the same functionality as
    // the getSpeed() method of the super class, thus no need to
    // actually define it
    // thus super.getSpeed() has the same meaning as getSpeed()
    public int getSpeed()
    {
        return super.getSpeed();
    }


    public void accelerate()
    {
        super.setSpeed(getSpeed()*3);
    }


}
