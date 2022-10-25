package ProgrammingInJavaOxford.Interfaces.modelling_a_car.tyres;

public class SteelTyres implements Tyres
{
    @Override
    public void selectTyres()
    {
        System.out.println("SteelTyres selected");
    }

    @Override
    public void runTyres()
    {
        System.out.println("SteelTyres running at 60 km/ph");
    }
}
