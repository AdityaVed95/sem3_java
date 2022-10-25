package ProgrammingInJavaOxford.Interfaces.modelling_a_car.brakes;

public class HydraulicBrakes implements Brakes
{
    @Override
    public void applyBrakes()
    {
        System.out.println("Applying Hydraulic Brakes");
    }

    @Override
    public void releaseBrakes()
    {
        System.out.println("Releasing Hydraulic Brakes");
    }
}
