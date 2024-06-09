import java.util.Arrays;
import java.util.HashMap;

public class PrintDuplicatesFromArray {
    public static void main(String[] args) {
        Integer[] arr = new Integer[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = 4;
        arr[4] = 6;
        arr[5] = 2;
        HashMap<Integer , Integer> map = new HashMap<>();
        Arrays.asList(arr).stream().forEach(e-> map.put(e , map.getOrDefault(e , 0) + 1));

        System.out.println("Printing out duplicates");
//        map.forEach((num, count) -> {
//            if (count > 1) {
//                System.out.println(num);
//            }
//        });

        map.keySet().stream().filter(integer -> map.get(integer) > 1).forEach(System.out::println);
    }
}
