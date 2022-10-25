package ProgrammingInJavaOxford.Interfaces.modelling_a_car.car_segments;

import ProgrammingInJavaOxford.Interfaces.modelling_a_car.Car;
import ProgrammingInJavaOxford.Interfaces.modelling_a_car.brakes.GasBrakes;
import ProgrammingInJavaOxford.Interfaces.modelling_a_car.brakes.HydraulicBrakes;

public class HondaFactory {

     public static Car getHondaAmaze2022(){
         return new HondaAmaze(new HydraulicBrakes());
    }

    public static Car getHondaAmaze2021(){
        return new HondaAmaze(new GasBrakes());
    }

}
