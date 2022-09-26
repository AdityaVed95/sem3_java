package HeadFirstOOAD.chp1.guitar_ex1.guitar_revised2;

public class Guitar extends Object
{
    private String serialNumber;
    private Wood backWood;
    private Wood topWood;

    public Guitar(String serialNumber, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", backWood=" + backWood +
                ", topWood=" + topWood +
                '}';
    }
}
