
public class StringBuilderMethods {
    public static void main(String args[]) {

        // Test case 1
        StringBuilder name = new StringBuilder(" thiru");
        String sub = name.substring(name.indexOf("t"), name.indexOf("r"));
        int len = name.length();
        char ch = name.charAt(4);
        System.out.println(sub + " " + len + " " + ch);

        // Test Case 2
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true
    }
}