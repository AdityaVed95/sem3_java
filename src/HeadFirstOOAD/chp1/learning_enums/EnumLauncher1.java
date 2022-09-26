package HeadFirstOOAD.chp1.learning_enums;

public class EnumLauncher1
{
    public static void main(String[] args)
    {
        // this generates an error :
        // DaysOfTheWeek day = new DaysOfTheWeek();
        // because enums are meant to be predefined set of values thus
        // we dont want to create new values

        DaysOfTheWeekLaunch1 day = DaysOfTheWeekLaunch1.SATURDAY;
        if(day == DaysOfTheWeekLaunch1.SATURDAY)
        {
            System.out.println("Yay, Its Saturday");
        }

        DaysOfTheWeekLaunch1[] array1 = DaysOfTheWeekLaunch1.values();

        for (DaysOfTheWeekLaunch1 myDay: DaysOfTheWeekLaunch1.values())
        {
            System.out.println(myDay);
        }

        System.out.println("");

        for(DaysOfTheWeekLaunch1 myDay : array1)
        {
            System.out.println(myDay);
        }



    }
}
