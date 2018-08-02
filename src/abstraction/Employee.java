package abstraction;

public abstract class Employee {

    private String name, id;

    private static final String company_name = "Infobox Inc"; //SUPER CONSTANT >> final value is fixed for other child classes
    public static String company_location = "Dhaka"; // static doesn't have any relation with objects, placed in 1 memory

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static String getCompany_name() {
        return company_name;
    }

    public abstract double getSalary();


}
