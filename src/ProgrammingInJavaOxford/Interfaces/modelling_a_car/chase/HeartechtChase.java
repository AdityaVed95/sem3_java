package ProgrammingInJavaOxford.Interfaces.modelling_a_car.chase;

public class HeartechtChase implements Chase
{
    static final int qualityRating = 2;

    @Override
    public void selectChase()
    {
        System.out.println("Selecting Heartecht chase");
    }

}
