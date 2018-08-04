package Interface;

public class MainClass {
    public static void main(String[] args) {

        InterfaceOne interfaceOne = new ClassA();
        System.out.println(interfaceOne.doSomething());

        InterfaceOne interfaceOne1 = new ClassB();
        System.out.println(interfaceOne1.doSomething());


        //Anonymous Inner Class type
        InterfaceOne interfaceOne2 = new InterfaceOne() {
            @Override
            public String doSomething() {
                return "from Anonymous Inner Class";
            }
        };
        System.out.println(interfaceOne2.doSomething());



    }
}
