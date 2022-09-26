package HeadFirstOOAD.chp1.guitar_ex1.guitar_revised;

import java.util.LinkedList;
import java.util.Objects;

public class Inventory
{
    LinkedList<Guitar> guitars;

    public Inventory()
    {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, String builder, String model, String type, String backWood, String topWood, double price)
    {
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber)
    {
        int i;
        for(i=0;i<guitars.size();i++)
        {
            Guitar guitar_object = guitars.get(i);
            if(Objects.equals(guitar_object.getSerialNumber(), serialNumber)) // meaning : if guitar_object.getSerialNumber() == serialNumber
            // meaning : if guitar_object.getSerialNumber().equals(serialNumber)
            {
                return guitar_object;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar)
    {
        //passing the guitar to be searched in the linked list as the formal parameter to this function
        int i;
        for(i=0;i<guitars.size();i++)
        {
            Guitar guitar_object = guitars.get(i);
            String builder = searchGuitar.getBuilder();

            if(builder != null && (!builder.equals("")) && (!builder.equals(guitar_object.getBuilder())))
            {
                continue;
            }

        }
        return null;
    }


}
