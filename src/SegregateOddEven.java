import java.util.*;
import java.util.stream.Collectors;

public class SegregateOddEven {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,11,6};
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        Arrays.stream(arr).filter(value -> value%2 == 0).forEach(evenList::add);
        Arrays.stream(arr).filter(value -> value %2 != 0).forEach(oddList::add);

        System.out.println("Even Elements");
        evenList.forEach(System.out::println);
        System.out.println("Odd Elements");
        oddList.forEach(System.out::println);



        Map<Boolean, List<Integer>> oddEvenNumbersMap = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();
        for(Map.Entry<Boolean, List<Integer>> entry : entrySet){
            if(entry.getKey()){
                System.out.println("Even Numbers");
            }else{
                System.out.println("Odd Numbers");
            }

            System.out.println("-------------");

            List<Integer> list = entry.getValue();

            for (int i : list)
            {
                System.out.println(i);
            }
        }
    }
}
