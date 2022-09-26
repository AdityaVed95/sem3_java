package test_concepts.call_by_ref;

public class Modify
{
    int a;
    int b;
    Modify(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void swap()
    {
        int c = this.a;
        this.a = this.b;
        this.b = c;

    }

    public void display()
    {
        System.out.println("a = "+this.a);
        System.out.println("b = "+this.b);
    }
}
