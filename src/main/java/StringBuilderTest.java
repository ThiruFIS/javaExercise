import java.util.Date;

public class StringBuilderTest {

    public static void main(String args[]) {

        // Case - 1
        /* Its Mutable it means if set the object to another variable,
        it will use same value i.e only line reference will be moved anotherLine
        as showed below*/
        StringBuilder line = new StringBuilder("-");
        StringBuilder anotherLine = line.append("-");

        System.out.println("line1" + line.append("-"));
        System.out.println("line2" + line);
        System.out.println("anotherLine" + anotherLine);

        Date d2 = new Date();

        System.out.print(line == anotherLine);

        // Case - 2
        StringBuilder sb = new StringBuilder();
        sb.append("red");
        sb.deleteCharAt(0);
        sb.delete(1, 2);
        System.out.println("case2: " + sb);

        // String[] stringArray = new String[] { "A", "B", "C", "D" };
        // List<String> stringList = Arrays.asList(stringArray);

    }
}