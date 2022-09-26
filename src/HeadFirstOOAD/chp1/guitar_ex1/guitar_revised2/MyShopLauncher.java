package HeadFirstOOAD.chp1.guitar_ex1.guitar_revised2;

public class MyShopLauncher {

    public static void main(String[] args) {
        Guitar myGuitar = new Guitar("sr_no_123",Wood.INDIAN_ROSEWOOD, Wood.MAPLE);
        Guitar myGuitar2 = new Guitar("sr_no_123",Wood.INDIAN_ROSEWOOD, Wood.MAPLE);

        System.out.println(myGuitar.toString());
        System.out.println(myGuitar2.toString());
    }


}
