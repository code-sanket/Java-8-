import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortNumbersString {

    public static void main(String[] args) {
        Object[] arr = {5, "apple", 3, "banana", 2, "orange", 1};
        Set<Object> uniqueSet = new HashSet<>(Arrays.asList(arr));

        Object[] uniqueArray = uniqueSet.toArray(new Object[0]);

        Arrays.sort(uniqueArray , (a,b) -> {
            if(a instanceof Integer && b instanceof Integer){
                return ((Integer) a- (Integer) b);
            }else if(a instanceof String && b instanceof String){
                return (((String) a).compareTo((String) b));
            }else if(a instanceof Integer){
                return -1; // means number comes before String
            }else{
                return 1; // String after Numbers
            }
        });

        System.out.println(Arrays.toString(uniqueArray));
    }
}
