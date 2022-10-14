public class VaraibleTypesSet {

    static char charValue = 'e';                   // Size - 16 bits
    static boolean booleantest = true;                           // JVM specific

    static byte byteIntegerPos = 127;              // Size - 8 bits
    static byte byteIntegerNeg = -128;             // Size - 8 bits

    // Note ---- if we use ' its thinking its a char primitive data types
    static byte byteIntegerChar = 't';             // Size - 8 bits
    static short a = 12311;                        // Size - 16 bits
    static int num = 1231231231;                   // Size - 32 bits
    static long longInteger = 12312312;            // Size - 64 bits

    static float floatvalue = 1231231231.12312313123123f;   // Size - 32 bits
    static double doublevalue = 123123123.12311231234522532351231513515315123431234532543253252145141423534123121123414113412312346346435437347456435634312;     // Size - 64 bits

    static String stringValue = "tsgdsdfsdfsdfsdfsdfsdfdsfesfgdsgsefgsedvsdvsdvds";

    /* Different type of variable declaration */
    String $test1   = "test1";
    String _test2   = "test2";
    String $test3   = "test3";
    String t12314   = "test4";
    String $ = "working";

    public static void main(String args[]) {

        System.out.println(doublevalue);
        System.out.println(booleantest);

        // Method or way to move from Character to String
        String set1 = Character.toString(charValue);

        String set2 = String.valueOf(charValue);

        System.out.println("Changing Char to String" + set2);
        int inttest1 = (int) 12341.13;
        float inttest2 = 2131231231232.23f;
        System.out.println("Changing float to Integer" + inttest1);

        float floattest1 = (float) inttest1;
        System.out.println("Changing Integer to float" + floattest1);

        // Changing from Long to Int
        int intfield1 = 1242354234;
        long longfield1 = new Long(234234523652235123L);
        long min=-9223372036854775808L;
        long max=9223372036854775807L;

        // This will throw compiler error because integer is 32 bits and setting to short which is 16 bits
        int g = 17;
        int y = g;
        y = y + 10;
        //short s = y;
    }
}
