package ProgrammingInJavaOxford.Interfaces.modelling_a_car.engine;

public class PetrolEngine implements Engine
{

    @Override
    public void startEngine()
    {
        System.out.println("Starting Petrol Engine");
    }

    @Override
    public void stopEngine()
    {
        System.out.println("Stopping Petrol Engine");
    }
}
