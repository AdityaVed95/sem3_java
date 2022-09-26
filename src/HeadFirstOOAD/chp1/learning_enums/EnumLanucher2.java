package HeadFirstOOAD.chp1.learning_enums;

public class EnumLanucher2
{
    public static void main(String[] args)
    {
        CerealsLanuch2 cereal1 = CerealsLanuch2.CHOCOS;
        int lod1 = CerealsLanuch2.CHOCOS.levelOfDeliciousness;

        if (lod1 == cereal1.levelOfDeliciousness)
        {
            System.out.println("same : "+lod1);
        }

        else
        {
            System.out.println("not same");
        }

        lod1 = 40;
        System.out.println(CerealsLanuch2.CHOCOS.levelOfDeliciousness);
        // changing lofd doesnt change Cereals.CHOCOS.levelOfDeliciousness


        // if the field is not kept final then anyone can change it
        // we dont want that to happen
        // thus we should make that field final
        // here levelOfDeliciousness is not final thus it is can be changed from outside

        CerealsLanuch2.CHOCOS.levelOfDeliciousness = 109;
        System.out.println(CerealsLanuch2.CHOCOS.levelOfDeliciousness);


        System.out.println(CerealsLanuch2.CHOCOS.price);

        // this will give error as price is final :
        // Cereals.CHOCOS.price = 1000.343;



    }
}
