package ClassObjectTwo;

import ClassObject.Car;
import ClassObject.SubCar;

public class AnotherSubCar extends Car implements CarInterface{
    public AnotherSubCar(){
        super();
//        mani_name = "Hasnat";
//        manu_year = 2018;
//
    }

    public AnotherSubCar(String car_name){
        super(car_name);
    }

    public AnotherSubCar(String manu_name, String model, String passKey, int engin_cc, float fuel){
        super(manu_name, model, passKey, engin_cc, fuel);
    }

    public AnotherSubCar(String manu_name, String model, String passKey, int engin_cc, float fuel, int year){
        super(manu_name, model, passKey, engin_cc, fuel, year);
    }


    @Override
    public void driveCar(int driveTimeInSec) {
        runForSeconds(driveTimeInSec);
    }

    @Override
    public void AddFuel(int amount) {
        addFuel(amount);
    }

    @Override
    public int get_manuYear() {
        return manu_year;
    }

    @Override
    public String modelName() {
        return getModel_name();
    }
}
