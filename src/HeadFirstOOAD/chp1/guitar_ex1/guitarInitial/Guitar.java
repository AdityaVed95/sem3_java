package HeadFirstOOAD.chp1.guitar_ex1.guitarInitial;

public class Guitar
{
    String serialNumber;
    double price;
    String builder;
    String model;
    String type;
    String backWood;
    String topWood;

    Guitar(String serialNum, double pric, String build, String mod , String typ , String bakWood, String tpWood)
    {
        serialNumber = serialNum;
        price = pric;
        builder = build;
        model = mod;
        type = typ;
        backWood = bakWood;
        topWood = tpWood;

    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
