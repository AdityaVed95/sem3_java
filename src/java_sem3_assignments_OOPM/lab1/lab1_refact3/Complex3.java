package java_sem3_assignments_OOPM.lab1.lab1_refact3;

public class Complex3
{
    double real;
    double imaginary;

    Complex3(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex3()
    {
        this.real = 0;
        this.imaginary = 0;
    }

    public void add(Complex3 object1, Complex3 object2)
    {
        this.real = object1.real + object2.real;
        this.imaginary = object1.imaginary + object2.imaginary;
    }

    public static Complex3 subtract(Complex3 object1, Complex3 object2)
    {
        Complex3 difference = new Complex3();
        difference.real = object1.real - object2.real;
        difference.imaginary = object1.imaginary - object2.imaginary;
        return difference;
    }

    public void multiply(Complex3 object1 , Complex3 object2)
    {
        this.real = object1.real* object2.real - (object1.imaginary* object2.imaginary);
        this.imaginary = object1.real*object2.imaginary + object2.real* object1.imaginary;

    }

    public static Complex3 divide(Complex3 object1, Complex3 object2)
    {
        Complex3 divided = new Complex3();

        // (r1*r2+i1*i2)/(r2*r2+i2*i2
        divided.real = (object1.real*object2.real + object1.imaginary* object2.imaginary )/(object2.real* object2.real + object2.imaginary* object2.imaginary);

        // (r2*i1 - r1*i2)/(r2*r2+i2*i2);
        divided.imaginary = (object2.real* object1.imaginary - object1.real* object2.imaginary) / (object2.real* object2.real + object2.imaginary* object2.imaginary);

        return divided;
    }

    public static void display_cui(Complex3 object)
    {
            System.out.println("Complex number is: ("+object.real+") + j("+object.imaginary+")");
    }


}
