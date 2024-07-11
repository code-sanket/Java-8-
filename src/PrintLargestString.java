import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintLargestString {

    public static void main(String[] args) {

        // Finding the largest Number
        List<String> list = List.of("Sanket", "Ankit", "Testing", "Bhavya", "Anshul");
        list.stream().sorted((s1 , s2) -> s2.length() - s1.length()).limit(1).forEach(System.out::println);
            Optional<String> ans = list.stream().max((s1 , s2) -> s1.length() - s2.length() );
            System.out.println(ans);
//        String ans = list.stream().max(Comparator.comparingInt(String::length)).orElse(null);
//        System.out.println(ans);


        //Finding Largest Number in Array.

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println( Arrays.stream(arr).max().orElse(-1));

        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Map<Integer, Long> freq = listOfIntegers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        freq.keySet().stream().filter(i-> i>= 2).forEach(System.out::println);
    }
}
