package ClassObjectTwo;

import ClassObject.Car;
import ClassObject.SubCar;

public class NextCar extends Car {
    public static void main(String[] args) {

        Car car = new Car("New Car", "J98", "hello", 3000, 20, 2000);
        SubCar newSubCar = new SubCar("JHDSFG", "OIUIO", "HGKJ", 34534, 34,2019,10, "Black");

        AnotherSubCar anotherSubCar = new AnotherSubCar("Car Last", "Kjhi", "kjh", 3455, 45, 2018);

        anotherSubCar.printInfo();

        anotherSubCar.AddFuel(10);
        System.out.println("## Current Fuel : "+ anotherSubCar.presentAmmountOfFuel());
        System.out.println("## MOdel Name : "+ anotherSubCar.modelName());
        System.out.println("## Manuf Year : "+ anotherSubCar.get_manuYear());
        System.out.println("\n");

        //Main.main(null);
        newSubCar.printInfo();
        System.out.println("\n");
        car.printInfo();
    }


}
