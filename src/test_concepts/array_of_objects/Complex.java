package test_concepts.array_of_objects;

public class Complex
{
    private double real;
    private double imaginary;

    public Complex()
    {
        this.real = 0.0;
        this.imaginary=  0.0;
    }

    Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary=  imaginary;
    }

    public void sum( Complex object1, Complex object2)
    {
        this.real = object1.real + object2.real;
        this.imaginary = object1.imaginary + object2.imaginary;
    }

    public void setValue(double real,double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static void display_array(Complex[] array)
    {
        for(int i =0;i<array.length;i++)
        {
            System.out.println("For "+(i+1)+" Num : ");
            System.out.println("Real : "+array[i].real);
            System.out.println("Imaginary : "+array[i].imaginary+"\n");

        }
    }
}
