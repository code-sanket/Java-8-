import java.util.*;

public class PrintLargestString {

    public static void main(String[] args) {

        // Finding the largest Number
        List<String> list = List.of("Sanket", "Ankit", "Testing", "Bhavya", "Anshul");
        String ans = list.stream().max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(ans);


        //Finding Largest Number in Array.

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println( Arrays.stream(arr).max().orElse(-1));
    }
}
