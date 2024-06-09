import java.util.function.*;

public class Java8FunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x->x%2 == 0;
        Function<Integer , Integer> function = x-> x*x;
        Consumer<Integer> consumer = x->System.out.println(x);
        Supplier<Integer> supplier = ()->100;


        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        Function<String,String> upperCaseFunction = x-> x.toUpperCase();
        UnaryOperator<String> unaryOperator = x-> x.toUpperCase(); // if you have same return type and argument type we can use unary operator
        BiFunction<String , String  , String> biFunction = (ch1 , ch2) -> ch1+ch2;

        BinaryOperator<String> binaryOperator = (ch1 , ch2) -> ch1+ch2; // if a bi-function have same return type and same two arguments type then we can use binary operator
        System.out.println(biFunction.apply("sanket" , "sinha"));
        System.out.println(binaryOperator.apply("sanket" , "sinha"));

       System.out.println( unaryOperator.apply("sanket"));
       System.out.println( upperCaseFunction.apply("sanket"));
    }
}
