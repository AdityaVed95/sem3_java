package ProgrammingInJavaOxford.Interfaces.modelling_a_car.transmission;

public class Manual implements Transmission
{

    @Override
    public void selectTransmission()
    {
        System.out.println("Manual Transmission selected");
    }
}
