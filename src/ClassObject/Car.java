package ClassObject;

public class Car {

    private String model_name;
    private String carKey;
    public String mani_name;
    int engin_cc;
    public float car_weight;
    private float fuel_ammount;
    protected int manu_year;

    final private float cost_fuel_per_second = 0.3f;

    public Car(){
        mani_name = new String();
        model_name = new String();
        engin_cc = 0;
        fuel_ammount = 20;
        manu_year = 0;
    }
    public Car(String car_name){
        mani_name = new String(car_name);
        model_name = new String();
        engin_cc = 0;
        fuel_ammount = 0;
        manu_year = 0;

    }

    public Car(String manu_name, String model, String passKey, int engin_cc, float fuel){
        mani_name = manu_name;
        model_name = model;
        carKey = passKey;
        this.engin_cc = engin_cc;
        fuel_ammount = fuel;
        manu_year = 0;

    }

    public Car(String manu_name, String model, String passKey, int engin_cc, float fuel, int year){
        this(manu_name, model, passKey, engin_cc, fuel);
        manu_year = year;
    }

    public void addFuel(float fuel_ammount){
        this.fuel_ammount += fuel_ammount;
    }

    public void runForSeconds(int timeInSec){
        float usedFuel = timeInSec * cost_fuel_per_second;
        fuel_ammount -= usedFuel;

    }

    public boolean matchPass(String userPass){
        return carKey.equals(userPass);
    }

    public String getMani_name(){
        return mani_name;
    }
    public String getModel_name(){
        return model_name;
    }


    public float presentAmmountOfFuel(){
        return fuel_ammount;
    }

    public void printInfo(){
        System.out.println("Sub car name: "+mani_name);
        System.out.println("Engin CC: "+engin_cc);
        System.out.println("Pass check: "+matchPass("code"));
        System.out.println("fUEL aMMOUNT: "+presentAmmountOfFuel()+" L");
        addFuel(30);
        System.out.println("Fuel after refill: "+presentAmmountOfFuel()+" L");
        runForSeconds(240);
        System.out.println("After 60 sec driving, fuel is : "+presentAmmountOfFuel()+" L");
    }


}
