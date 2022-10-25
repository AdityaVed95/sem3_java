package ProgrammingInJavaOxford.Interfaces.modelling_a_car.transmission;

public class CVT implements Automatic
{

    @Override
    public void selectTransmission()
    {
        System.out.println("CVT Transmission Selected");
    }
}
