package ProgrammingInJavaOxford.Interfaces.modelling_a_car.brakes;

public class GasBrakes implements Brakes
{
    public void applyBrakes()
    {
        System.out.println("Applying Gas Brakes");
    }

    public void releaseBrakes()
    {
        System.out.println("Releasing Gas Brakes");
    }
}
