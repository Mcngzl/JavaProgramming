package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {

    public static void main(String[] args) {

        System.out.println( AcccessModifiers.publicData );
        System.out.println( AcccessModifiers.defaultData );
        //    System.out.println( AccessModifiers.privateData ); // private is not visible outside the class

        AcccessModifiers.method1();
        AcccessModifiers.method2();
        //    AccessModifiers.method3(); // private is not visible outside the class


    }


}
