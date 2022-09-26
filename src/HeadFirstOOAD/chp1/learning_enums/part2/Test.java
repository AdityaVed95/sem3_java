package HeadFirstOOAD.chp1.learning_enums.part2;

import java.util.Hashtable;
import java.util.Scanner;

// An Enum class
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

// Driver class that contains an object of "day" and
// main().
public class Test {
    Day day;
    Object obj;
    Hashtable hashtable;





    // Constructor
    public Test(Day day) { this.day = day; }

    // Prints a line about Day using switch
    public void dayIsLike()
    {
        switch (day) {
            case MONDAY -> System.out.println("Mondays are bad.");
            case FRIDAY -> System.out.println("Fridays are better.");
            case SATURDAY, SUNDAY -> System.out.println("Weekends are best.");
            default -> System.out.println("Midweek days are so-so.");
        }
    }

    // Driver method
    public static void main(String[] args)
    {

        Day day1 = Day.SATURDAY;
        Test t1 = new Test(day1);

        //String str = "MONDAY";
        //Test t1 = new Test(Day.valueOf(str));

        t1.dayIsLike();
    }
}
