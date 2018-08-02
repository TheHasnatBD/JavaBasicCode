package polymorphism;

public class AnotherChildClass extends ParentClass {
    public String zipCode;

    public AnotherChildClass(String name, String age, String zipCode) {
        super(name, age);
        this.zipCode = zipCode;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", "+ zipCode;
    }
}
