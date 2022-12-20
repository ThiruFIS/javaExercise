/*
    Order matters for the fields and blocks of code. You can’t refer to a variable before it has
    been initialized.
 */

public class CodeOrderMatters {

    // Doesnot Compile
    {System.out.println( printVariable1);}
    {System.out.println( printVariable2);}

    // Short note - Single quotes for literal Char fields and double quotes for literal Strings
    static char printVariable1 = 'a';
    static String printVariable2 = "test1";

    public static void main(String args[]) {

    }
}