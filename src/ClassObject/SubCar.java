package ClassObject;


public class SubCar extends Car {

    private float batteryInCharge;
    private String color;

    public SubCar(){
        super();
    }

    public SubCar(String manu_name, String model, String passKey, int engin_cc, float fuel, float charge, String Color){
        super(manu_name, model, passKey, engin_cc, fuel);

        batteryInCharge = charge;
        color = Color;


    }

    public SubCar(String manu_name, String model, String passKey, int engin_cc, float fuel, int year, float charge, String Color){
        super(manu_name, model, passKey, engin_cc, fuel, year);

        batteryInCharge = charge;
        color = Color;

    }


    public float getBatteryInCharge() {
        return batteryInCharge;
    }

    public void setBatteryInCharge(float batteryInCharge) {
        this.batteryInCharge = batteryInCharge;
    }

    public String getColor() {
        return color;
    }


    @Override
    public void printInfo(){

        super.printInfo();

        System.out.println("Battery Voltage : "+getBatteryInCharge()+" V");
        System.out.println("cOLOR : "+getColor());

    }
}
