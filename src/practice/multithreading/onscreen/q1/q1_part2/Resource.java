package practice.multithreading.onscreen.q1.q1_part2;

class Resource
{
    static String months[] = {"Januray","Feb","March","April","May","June","July","August","September","October","November","December"};
    static String days[] = {"Mon","Tues","Wed","Thurs","Fri","sat","sun"};
    static int counter=0;

    synchronized static public void Display(String name)
    {
        if(counter==0)
        {
            for (int i = 0; i < months.length; i++)
            {
                System.out.println("In thread : "+name+" : "+months[i]);
            }
            counter+=1;
        }

        else
        {
            for (int i = 0; i < days.length; i++)
            {
                System.out.println("In thread : "+name+" : "+days[i]);
            }

        }


    }
}