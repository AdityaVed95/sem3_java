package ProgrammingInJavaOxford.understanding_enums.eg1;

public class Launcher
{
    public static void main(String[] args)
    {
        Games g1 = Games.SWIMMING;
        System.out.println(g1.ordinal());
        System.out.println(g1.name());
        System.out.println(g1.toString());
        System.out.println(g1);

        Games g2 = Games.CYCLING;
        System.out.println(g1.compareTo(g2));
        System.out.println(g1.equals(g2));

        Games [] G = Games.values();

        System.out.println("============================================================");

        for(int i=0;i<G.length;i++)
        {
            System.out.println(G[i]);
        }
        System.out.println("============================================================");
        for (Games games : G)
        {
            System.out.println(games);
        }

    }
}
