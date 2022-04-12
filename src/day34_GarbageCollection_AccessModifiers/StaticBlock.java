package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main block");


    }
    static {


        System.out.println("Static block");
    }


    static {
        System.out.println("Static block2");
    }

    static {
        System.out.println("Static block3");
    }

}
