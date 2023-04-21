public class TernaryOperator {
    public static void main(String args[]) {

        // Test Case 1
        int y = 10;
        final int x1;
        if(y > 5) {
            x1 = 2 * y;
        } else {
            x1 = 3 * y;
        }

        System.out.println("Statement - 1 - x1 = " + x1);
        int x2 = (y > 5) ? (2 * y) : (3 * y);
        System.out.println("Statement - 2 - x2 = " + x2);

        // Test Case 2
        System.out.println( (x2 > 10) ? 21 : "FIS");
        //String s1 = (x2 > 10) ? 21 : "FIS";

        // Test Case 3
        int t3y = 1;
        int t3z = 1;
        final int t3x = t3y<10 ? t3y++ : t3z++;
        System.out.println(y+","+t3z);

        final int t3x1 = t3y>10 ? t3y++ : t3z++;
        System.out.println(y+","+t3z);

    }
}