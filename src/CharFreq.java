import java.util.HashMap;

public class CharFreq {

    public static void main(String[] args) {

        String ans = "Hellow World";

        HashMap<Character , Long> charMap = new HashMap<>();
        ans.chars().mapToObj(c -> (char)c)
                .forEach(character -> charMap.merge(character, 1L , Long::sum));

        charMap.forEach((character, aLong) -> System.out.println(character + ": " + aLong));

    }



}
