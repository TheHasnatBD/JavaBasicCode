package polymorphism;

public class ChildClass extends ParentClass{

    public String city;

    public ChildClass(String name, String age, String city) {
        super(name, age);
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    @Override
    public String getInfo() {

        return super.getInfo() + ", "+ getCity();
    }
}
