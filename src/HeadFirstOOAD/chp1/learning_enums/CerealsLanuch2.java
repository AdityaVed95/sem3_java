package HeadFirstOOAD.chp1.learning_enums;

public enum CerealsLanuch2
{
    KELLOGS_ORIGINAL(80, 100.4),
    KELLOGS_STRAWBERRY(40, 80.3),
    CHOCOS(90, 90.2),
    CAPTAIN_CRUNCH(75, 40.523),
    FROOT_LOOPS(60, 20.432);

    // fields of Cereal enum :

    int levelOfDeliciousness;
    final double price;

    // constructor of Cereals enum :

    // No of usages is equal to the number of cereal types defined above
    CerealsLanuch2(int levelOfDeliciousness, double price)
    {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }

}
