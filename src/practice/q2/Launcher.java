package practice.q2;

public class Launcher
{
    public static void main(String[] args)
    {
        Vector v1 = new Vector(1,2,3);
        Vector v2 = new Vector(3,4,5.5);
        Vector sumVector = new Vector();
        sumVector.sum(v1,v2);
        sumVector.printData();


    }
}
