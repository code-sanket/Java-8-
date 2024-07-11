package interfaceAndAbstractJava8;

public class RunnerClass {

    static class Run implements TestingInterface{

        @Override
        public void meth1() {
            System.out.println("Giving Implementation to Interface Method");
        }
    }

    public static void main(String[] args) {

        Run run = new Run();
        run.printName();
        run.meth1();

        TestingInterface.printId();
    }
}
