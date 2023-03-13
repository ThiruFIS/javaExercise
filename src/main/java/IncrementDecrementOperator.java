public class IncrementDecrementOperator {
    public static void main(String args[]) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        // int y = 4 * 5 / 4 + 2
        // int y = 20 / 4 + 2
        // int y = 5 + 2
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}
