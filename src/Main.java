import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("hello world");


        Integer[] arr = {1,2,3,4,4,5,5,6};
        List<String> list = List.of("Sanket" , "Archit" , "Bhavya"); // Crate an immutable list
        List<String> ans = new ArrayList<>(List.of("ssw","snsj")); // normal List
        ans.add("dsdsd");

        List<String> abc = Arrays.asList("Sanket" , "Bhavya" , "Uouhdh"); //Mutable list but has fixed size
        abc.set(0,"Ayushi");

        ArrayList<Integer> arrList = new ArrayList<>(List.of(arr));
        arrList.add(23232);



    }
}