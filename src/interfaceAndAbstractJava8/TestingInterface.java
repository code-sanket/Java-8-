package interfaceAndAbstractJava8;
@FunctionalInterface
public interface TestingInterface {

    void meth1();

    default void printName(){
        System.out.println("Printing name....");
    }

    static void printId(){
        System.out.println("Printing ID....");
    }
}
