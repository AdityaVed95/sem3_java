package ProgrammingInJavaOxford.Interfaces.modelling_a_car;

import ProgrammingInJavaOxford.Interfaces.modelling_a_car.brakes.Brakes;
import ProgrammingInJavaOxford.Interfaces.modelling_a_car.chase.Chase;
import ProgrammingInJavaOxford.Interfaces.modelling_a_car.engine.Engine;
import ProgrammingInJavaOxford.Interfaces.modelling_a_car.transmission.Transmission;
import ProgrammingInJavaOxford.Interfaces.modelling_a_car.tyres.Tyres;

public abstract class Car implements Brakes
{
    int passengerCarryingCapacity;
    int weight;
    Brakes breakingSystem;

    public Car(Brakes breakingSystem) {
        this.breakingSystem = breakingSystem;
    }

    @Override
    public void applyBrakes() {
        breakingSystem.applyBrakes();

    }

    @Override
    public void releaseBrakes() {
        breakingSystem.releaseBrakes();

    }
}

