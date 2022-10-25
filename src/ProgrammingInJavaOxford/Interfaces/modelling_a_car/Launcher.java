package ProgrammingInJavaOxford.Interfaces.modelling_a_car;

import ProgrammingInJavaOxford.Interfaces.modelling_a_car.brakes.Brakes;
import ProgrammingInJavaOxford.Interfaces.modelling_a_car.car_segments.HondaAmaze;
import ProgrammingInJavaOxford.Interfaces.modelling_a_car.car_segments.HondaFactory;

public class Launcher
{
    public static void main(String[] args)
    {
        Car amaze1 = HondaFactory.getHondaAmaze2022();
        Car amaze2 = HondaFactory.getHondaAmaze2021();

        amaze1.applyBrakes();
        amaze2.applyBrakes();

        Brakes hydraulicBreakOfAmaze = (Brakes) amaze1;
        hydraulicBreakOfAmaze.releaseBrakes();
        hydraulicBreakOfAmaze = (Brakes) amaze2;
        hydraulicBreakOfAmaze.releaseBrakes();

        System.out.println("==================================");
        amaze1.applyBrakes();
        amaze2.applyBrakes();

    }
}
