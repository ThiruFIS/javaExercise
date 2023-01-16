import javax.print.DocFlavor;

public class VariableTypes {

    static byte byteIntegerPos = 127;              // Size - 8 bits
    static byte byteIntegerNeg = -128;             // Size - 8 bits
    static byte byteIntegerChar = 't';             // Size - 8 bits

    static char charValue = 'e';                   // Size - 16 bits
    static short a = 12311;                        // Size - 16 bits - Can be declared as Short (Caps 'S')
    static int num = 1231231231;                   // Size - 32 bits - Only small int - but can declare as Integer (Wrapper class)
    static long longInteger = 12312312;            // Size - 64 bits -

    static float floatvalue = 1231231231.12312313123123f;   // Size - 32 bits
    static double doublevalue = 123123123.123112312312;     // Size - 64 bits

    static String stringValue = "tsgdsdfsdfsdfsdfsdfsdfdsfesfgdsgsefgsedvsdvsdvds";

    /* Different type of variable declaration */
    String test1   = "test1";
    String _test2   = "test2";
    String $test3   = "test3";
    String t12314   = "test4";

    Short thiru1 = 13421;
    int pos = 123;

    Integer in = null;
    String s = null;

    String testing1 = "123";
    int test11 = Integer.parseInt(testing1);

    static String _ = "test123";
    static String Blue = "rest";
    static String blue$ = "test12312";
    static String _blue = "testomg";

    public static void main(String args[]) {

        System.out.println("byteInteger:" + byteIntegerNeg);
        System.out.println("short:" + a);
        System.out.println("Integer:" + num);
        System.out.println("LongInteger:" + longInteger);

        System.out.println("floatvalue:" + floatvalue);
        System.out.println("doublevalue:" + doublevalue);
        System.out.println("V1:" + _);
        System.out.println("V2:" + Blue);
        System.out.println("V3:" + blue$);
        System.out.println("V4:" + _blue);

        // -- Note
        /*
        Conditional Operator ( ? : )
        Conditional operator is also known as the ternary operator. This operator consists of three operands and is used to evaluate Boolean expressions. The goal of the operator is to decide, which value should be assigned to the variable. The operator is written as −
        */

        int meal = 7;
        int tip = 2;

        System.out.println("total1-"+ (meal>6 ? meal-- : tip));

        System.out.println("tip1"+ tip);
        tip--;
        System.out.println("tip2"+ tip);
        tip--;
        System.out.println("tip3"+ tip);
        tip--;
        System.out.println("tip4"+ tip);
        tip--;
        System.out.println("tip5"+ tip);
        tip--;
        System.out.println("tip6"+ tip);

        // -- Note ---> var
        /*
        1. You can use var only for local variables (in methods). It cannot be used for instance variables (at class level).
        2. You cannot use var in Lambda expressions.
        3. You cannot use var for method signatures (in return types and parameters).

        //var message = "Hello, Java 10";
         */

        // -- Note --- Adding character - it wont add it will append
        String a = "12";
        a +="23";
        System.out.println("String adding-"+ a);


        // We can declare as showed below
        //double num1, int num2 = 0;
        int num3, num4;
        //int num1, num2 = 0;
       // int num1 = 0, num2 = 0;

        // -- Note
        /*
        public static void secret(String mystery) {
            char ch = mystery.charAt(3);
            mystery = mystery.insert(1, "more");
            int num = mystery.length();
        }
        */

        boolean carrot = true;
        Boolean potato = false;
        boolean broccoli = true;
        carrot = carrot & potato;
        broccoli = broccoli ? !carrot : potato;
        potato = !broccoli ^ carrot;
        System.out.println(carrot + "," + potato + "," + broccoli);
    }
}