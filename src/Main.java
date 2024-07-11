import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        Integer sumOfDigits = Stream.of(String.valueOf(i).split(""))
                .map(a-> Integer.parseInt(a))                    // Convert each string digit to integer
                .reduce(0, (a, b) -> a + b);
        System.out.println(sumOfDigits);
    }
    }
