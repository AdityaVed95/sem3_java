package java_sem3_assignments_OOPM.lab1.lab1_refact2;

public class ComplexCalculations3
{
    double real1;
    double real2;
    double imaginary1;
    double imaginary2;
    double sum_real;
    double sum_imaginary;
    double diff_real;
    double diff_imaginary;
    double multiplied_real;
    double multiplied_imaginary;
    double divide_real;
    double divide_imaginary;


    ComplexCalculations3()
    {
        real1 = 0;
        real2 = 0;
        imaginary1 = 0;
        imaginary2 = 0;
    }

    ComplexCalculations3(double r1,double r2, double i1, double i2)
    {
        real1 = r1;
        real2 = r2;
        imaginary1 = i1;
        imaginary2 = i2;
    }


    public void addition()
    {
        sum_real = real1+real2;
        sum_imaginary = imaginary1+imaginary2;

    }

    public void subtraction()
    {

    }

    public void multiplication()
    {

    }

    public void division()
    {

    }

}
