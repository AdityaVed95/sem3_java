package ProgrammingInJavaOxford.multithreading.five_isAlive_join;

public class Launcher
{
    public static void main(String[] args)
    {
        Counter1 counterObj1 = new Counter1("New Counter 1");
        new Counter1("New Counter 2");

        // System.out.println(counterObj1.isAlive);
        // the above statement does not work
        // thus implementing the runnable interface helps you to
        // give a more connection with the actual use case of oop
        // model, it doesnt make you feel you are dealing with
        // threads although you are achieving multithreading

        // there is also no need to create counterObj1

        // when the object of Counter1 is created, the constructor of
        // it is called , the constructor creates an object of thread
        // class and the start method of that object is called.
        // this calls the run method of the Counter1 class.


    }
}
