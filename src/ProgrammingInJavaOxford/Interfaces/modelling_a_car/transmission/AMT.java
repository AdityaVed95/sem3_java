package ProgrammingInJavaOxford.Interfaces.modelling_a_car.transmission;

public class AMT implements Automatic
{

    @Override
    public void selectTransmission()
    {
        System.out.println("AMT Transmission Selected");
    }
}
