package HeadFirstOOAD.chp1.learning_enums;

public class PlanetLauncher3
{
    public static void main(String[] args)
    {
        Planets3 myPlanet = Planets3.MARS;
        canILiveHere(myPlanet);

        Planets3 myPlanet2 = Planets3.EARTH;
        canILiveHere(myPlanet2);

    }

    public static void canILiveHere(Planets3 myPlanet)
    {
        switch (myPlanet)
        {
            case EARTH -> System.out.println("You can live here ... :)");
            default -> System.out.println("You cant live here yet... :(");
        }
    }

}
