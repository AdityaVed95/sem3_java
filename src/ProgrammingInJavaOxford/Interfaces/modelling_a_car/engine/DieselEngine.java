package ProgrammingInJavaOxford.Interfaces.modelling_a_car.engine;

public class DieselEngine implements Engine
{

    @Override
    public void startEngine()
    {
        System.out.println("Starting Diesel Engine");
    }

    @Override
    public void stopEngine()
    {
        System.out.println("Stopping Diesel Engine");
    }
}
