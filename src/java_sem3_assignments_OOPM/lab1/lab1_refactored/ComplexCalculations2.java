package java_sem3_assignments_OOPM.lab1.lab1_refactored;

public class ComplexCalculations2// this is a true service and can be called from either cui or gui
{

    public static double[] addition(double r1, double i1, double r2, double i2)
    {
        double sum_real = r1+r2;
        double sum_imaginary = i1+i2;
        double array1[] = {sum_real,sum_imaginary};
        return array1;
    }

    public static double[] subtraction(double r1, double i1, double r2, double i2)
    {
        double diff_real = r1-r2;
        double diff_imaginary = i1-i2;
        double [] array1 = {diff_real,diff_imaginary};
        return array1;
    }

    public static double[] multiply(double r1, double i1, double r2, double i2)
    {
        // (r1+i(im1) ) * (r2+i(im2) ) = r1*r2 - im1*im2   +  i (  r1*im2 + r2*im1   )
        double real_part = r1*r2 - (i1*i2);
        double imaginary_part = r1*i2 + r2*i1;
        double [] array1 = {real_part,imaginary_part};
        return array1;
    }

    public static double [] divide(double r1, double i1, double r2, double i2)
    {
        // [r1+i(im1)] / [r2+i(im2)]  =  [r1+i(im1)] * [r2-i(im2)] / r2*r2 + im2*im2
        // = { [r1*r2 + im1*im2 ] / r2*r2 + im2*im2 } + i { -r1*im2 + r2*im1 / r2*r2 + im2*im2  }

        double real_part = (r1*r2+i1*i2)/(r2*r2+i2*i2);
        double imaginary_part = (r2*i1 - r1*i2)/(r2*r2+i2*i2);
        double [] array1 = {real_part,imaginary_part};
        return array1;

    }

}