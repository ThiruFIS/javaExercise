public class CompoundAssignmentOperator {
    public static void main(String args[]) {
        int x = 2, z = 3;
        x = x * z;   // Simple assignment operator
        System.out.println(x);
        x *= z;     // Compound assignment operator
        System.out.println(x);

        /* -----------------------------
        internal casting Compound assignment operator
        long a = 10;
        int b = 5;
        b = b * a; // DOES NOT COMPILE
        */

        long a = 10;
        int b = 5;
        b *= a;
        System.out.println(b);

        /* -----------------------------
        Compound assignment operator
        */

        long c = 5;
        long d = (c=3);
        System.out.println(c);
        System.out.println(d);

    }
}
