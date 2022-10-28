import java.util.Map;
import java.util.HashMap;

/*
 * HashMap
 * Author - Thiru
 * Before Java 7, when using generics, we had to provide type parameters for variable types and their actual types.
 * Now he’s a little relieved about this new feature in Java 7. And an empty Java diamond operator on the right side of the statement will work fine.
 */
class DiamondOperator {
    public static void main(String[] args) {

        // source 7 or higher to enable diamond operator
        Map<Integer, String> map = new HashMap<>();
        map.put(null, "123");
        String str = map.get(null);
        System.out.println(str);
    }
}
