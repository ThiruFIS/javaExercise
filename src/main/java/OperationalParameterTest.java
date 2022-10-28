public class OperationalParameterTest {

    public static void main(String args[]) {

        int height = 2, length = 3;
        boolean w = height > 1 | --length < 4;
        int x = height!=2 ? length++ : height;
        boolean z = height % length == 0;
        System.out.println(w + "-" + x + "-" + z);

        // Go through this operational symbols
        // https://www.programiz.com/java-programming/operator-precedence

        // bitwise operators example
        // https://www.programiz.com/java-programming/bitwise-operators

        // Boolean Conditions - 1
        int test2 = 3;
        boolean test1 = test2 > 3;

        System.out.println(test1);

        // Boolean Conditions - 2
        int test3 = 4;

        System.out.println(test1);

    }
}