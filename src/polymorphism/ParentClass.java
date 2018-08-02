package polymorphism;

public class ParentClass {

    public String name, age;


    public ParentClass(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo(){
        return name + ", "+ age;
    }
}
