package practice.q2;

public class Vector
{
    private double i,j,k;

    Vector()
    {
        i=0;
        j=0;
        k=0;

    }

    Vector(double i,double j,double k)
    {
        this.i = i;
        this.j = j;
        this.k = k;
    }


    public void sum(Vector v1, Vector v2)
    {
        this.i = v1.i + v2.i;
        this.j = v1.j + v2.j;
        this.k = v1.k + v2.k;

    }

    public void printData()
    {
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }

}
