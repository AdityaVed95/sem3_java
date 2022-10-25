package ProgrammingInJavaOxford.understanding_enums.eg2;

public class Launcher
{
    public static void main(String[] args)
    {
        GamePlayer gp1 = GamePlayer.CRICKET;
        /*Accessing GamePlayer.CRICKET
        causes the JVM to invoke the constructor with the
        argument Sachin */
        System.out.println(gp1.getDescription());
        System.out.println(gp1);
    }
}

