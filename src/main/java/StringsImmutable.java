
public class StringsImmutable {

    public static void main(String args[]) {

        String printVariable1 = "JavaGuild";
        String printVariable2 = "JavaGuild";

        String printVariable3 = new String("JavaGuild");

        System.out.println(printVariable1 == printVariable2);

        System.out.println(printVariable1 == printVariable3);
    }
}