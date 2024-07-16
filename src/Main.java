import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("hello world");


//        Integer[] arr = {1,2,3,4,4,5,5,6};
//        List<String> list = List.of("Sanket" , "Archit" , "Bhavya"); // Crate an immutable list
//        List<String> ans = new ArrayList<>(List.of("ssw","snsj")); // normal List
//        ans.add("dsdsd");
//
//        List<String> abc = Arrays.asList("Sanket" , "Bhavya" , "Uouhdh"); //Mutable list but has fixed size
//        abc.set(0,"Ayushi");
//
//        ArrayList<Integer> arrList = new ArrayList<>(List.of(arr));
//        arrList.add(23232);


        List<String> nameList = List.of("Sanket" ,"abc","hsjd","ksjjende" , "jnde");

        if(nameList.stream().anyMatch((s) -> s.length() == 5)){
            System.out.println("Length equals to 5 exist");
        }

        nameList.stream().map(String::length).forEach(System.out::println);
        nameList.stream().sorted(( name1,  name2) -> name2.length() - name1.length()).forEach(System.out::println);

        int i = 15623;

        String str = "abc";
        str = Arrays.stream(str.split("")).map(String::toUpperCase).collect(Collectors.joining());
        System.out.println(str);

        System.out.println(Arrays.stream(String.valueOf(i).split("")).map(e -> Integer.parseInt(e)).reduce(0,(a,b)-> a+b));

        System.out.println("Printing Sum");

//        Integer sumOfDigits = Stream.of(String.valueOf(i).split(""))
//                .map(a-> Integer.parseInt(a))                    // Convert each string digit to integer
//                .reduce(0, (a, b) -> a + b);

//        System.out.println(sumOfDigits);

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Stream<Integer> i1 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1);
        System.out.println(listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
        i1.forEach(System.out::println);

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> elementCountMap = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //find the most freq element
        System.out.println(elementCountMap.entrySet().stream()
                .max((e1 , e2)-> (int) (e1.getValue() - e2.getValue()))
                .get()
                .getKey());

        System.out.println("Printed the most freq element");


        Map.Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println("Most Frequent Element : "+mostFrequentElement.getKey());

        System.out.println("Count : "+mostFrequentElement.getValue());

    }
    }
