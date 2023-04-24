public class ForStatement {

    public static void main(String args[]) {

        System.out.println( " Test Case 1");
        // Test Case 1
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println( "");
        System.out.println( " Test Case 2");
        /* Test Case 2
        for (;;) {
            System.out.print("Infinite loop");
        }
        */

        System.out.println( " Test Case 3");
        /* Test Case 3
        Multiple Terms to the for Statement
        */
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);
    }
}
