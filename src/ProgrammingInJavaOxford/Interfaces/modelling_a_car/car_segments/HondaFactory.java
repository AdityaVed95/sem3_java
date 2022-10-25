package ProgrammingInJavaOxford.Interfaces.modelling_a_car.car_segments;

import ProgrammingInJavaOxford.Interfaces.modelling_a_car.Car;
import ProgrammingInJavaOxford.Interfaces.modelling_a_car.brakes.GasBrakes;
import ProgrammingInJavaOxford.Interfaces.modelling_a_car.brakes.HydraulicBrakes;

public class HondaFactory {

     static Car getHondaCar2022(){
         return new HondaAmaze(new HydraulicBrakes());
    }

    static Car getHondaCar2021(){
        return new HondaAmaze(new GasBrakes());
    }

}
