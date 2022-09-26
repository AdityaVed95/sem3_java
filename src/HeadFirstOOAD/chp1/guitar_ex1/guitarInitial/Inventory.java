package HeadFirstOOAD.chp1.guitar_ex1.guitarInitial;

import java.util.LinkedList;
import java.util.Scanner;

public class Inventory
{
    static LinkedList<Guitar> ll1 = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
//    static int count_addGuitar_call=0;

    public static void main(String [] args)
    {
        addGuitar("1000",5000.245,"Hard","XtSR-95","Band","teak","timber");
        getGuitar();
        search();
    }

    public static void addGuitar(String serialNum,double pric, String build,String mod , String typ , String bakWood,String tpWood)
    {
//        String temp = String.valueOf(count_addGuitar_call);
//        String name1 = "guitarObject"+temp;
//        String name2 = name1;

        Guitar guitarObject = new Guitar(serialNum,pric,build,mod,typ,bakWood,tpWood);
        ll1.add(guitarObject);
//        count_addGuitar_call++;
    }

    public static Guitar getGuitar() // this fxn returns an object of type Guitar Class
    {
        System.out.println("Enter the guitar element number you want to search");
        int i;
        i =sc.nextInt();
        return ll1.get(i);
    }

    public static void search()
    {

    }

}
