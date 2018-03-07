package ClassObject;

public class Main {

    static private Car anotherOurCar;

    public static void main(String[] args) {

        SubCar subCar = new SubCar("BMW", "U9", "code", 5000, 40, 10, "gray");
        Car thirdCar = new Car("Yamah", "Y94", "pass", 2000, 20);
        anotherOurCar = new Car("TYOTA", "H34", "pass", 3444, 67);

        anotherOurCar.printInfo();
        System.out.println("\n");
        thirdCar.printInfo();
        System.out.println("\n");
        subCar.printInfo();
        System.out.println("\n");
    }
}
