import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintNumbersFromAlphaNumericArray {

    public static void main(String[] args) {
        char[] chars = {'a', '1', 'b', '2', 'c', '3', 'd', '4', 'e', '5'};

        // Convert char[] to Character[] array
        Character[] characters = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            characters[i] = chars[i];
        }

        // Using streams to filter numeric characters
//        Arrays.stream(characters)
//                .filter(c -> c >= '0' && c<= '9') // Filter numeric characters
//                .forEach(System.out::println);

        Arrays.stream(characters)
                // Filter numeric characters
                .forEach(character -> {
                    if (character >= '0' && character <= '9'){
                        System.out.println(character);
                    }
                });
    }
}
