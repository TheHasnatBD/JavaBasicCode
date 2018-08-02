package polymorphism;

public class PolymorphismMainClass {

    public static void main(String[] args) {

        ParentClass p = new ParentClass("DEF", "22");
        ChildClass c = new ChildClass("abc", "40", "Dhaka");
        ChildClass c_2 = new ChildClass("QWERT", "10", "Bagerhat");


        // this object acting as ParentClass object
        ParentClass p1 = new ChildClass("XYZ", "18", "Khulna"); // Up casting


        // #n for understanding println method easily
        System.out.println("#1 "+c.getInfo());

        c = (ChildClass) p1; // down casting
        System.out.println("#3 "+c.getInfo());

        ParentClass p2 = c;
        System.out.println("#4 "+p2.getInfo());

        /**
         * for AnotherChildClass
         */
        AnotherChildClass an_c = new AnotherChildClass("HIJ", "14", "1207");
        ParentClass p3 = an_c;
        System.out.println("#5 "+p3.getInfo());

        /*
        *Here ParentClass's objects acting different roles like different CHILD roles
        *That's looks like poly-behaviour. That means, polymorphism
        * */
        System.out.println("---------------------");
        ParentClass[] parents = new ParentClass[3];
        parents[0] = c_2;
        parents[1] = c;
        parents[2] = an_c;

        //-------run time POLYMORPHISM -------
        for (ParentClass parentClass : parents){
            // here, 'parents' behaves polymorphic
            System.out.println(parentClass.getInfo());
        }



    }
}
