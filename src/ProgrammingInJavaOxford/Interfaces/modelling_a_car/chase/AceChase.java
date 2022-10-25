package ProgrammingInJavaOxford.Interfaces.modelling_a_car.chase;

public class AceChase implements Chase
{
    static final int qualityRating = 4;

    @Override
    public void selectChase()
    {
        System.out.println("Selecting ACE chase");
    }

}
