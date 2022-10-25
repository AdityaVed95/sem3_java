package ProgrammingInJavaOxford.Interfaces.modelling_a_car.tyres;

public class AlloyTyres implements Tyres
{


    @Override
    public void selectTyres()
    {
        System.out.println("Alloy Tyres Selected");
    }

    @Override
    public void runTyres()
    {
        System.out.println("Alloy Tyres running at 100 km/ph");
    }
}
