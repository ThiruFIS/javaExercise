
public class StringBuilderTest {
    public static void main(String args[]) {

        // Test case 1
        StringBuilder sb = new StringBuilder("thiru");
        sb.append("+from"); // sb = "thiru+from"
        StringBuilder same = sb.append("+fis"); // "thirufromfis"

        System.out.println(same);

        // Test Case 2
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        // Test Case 3
        StringBuilder name = new StringBuilder(2);
        System.out.println("nameCapacity=" + name.capacity());
        name.append("th");
        System.out.println("name=" + name);
        System.out.println("nameCapacity=" + name.capacity());
        name.append("iru");
        System.out.println("name=" + name);
        System.out.println("nameCapacity=" + name.capacity());
        System.out.println("------------------");
        StringBuilder name1 = new StringBuilder("thiru");
        System.out.println("name=" + name1);
        System.out.println("nameCapacity=" + name1.capacity());
    }
}