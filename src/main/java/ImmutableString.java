public class ImmutableString {
    public static void main(String args[]) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        String s3 = "4";
        s3 = s2.concat(s3);
        System.out.println(s2);
        System.out.println(s3);
    }
}
