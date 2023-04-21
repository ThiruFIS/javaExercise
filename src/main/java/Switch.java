import sun.font.TrueTypeFont;

public class Switch {
    public static void main(String args[]) {

        // Test Case 1
        int dayOfWeek = 5;
        switch(dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        /* Test Case 2
        boolean dayOfWeek2 = true;
        switch(dayOfWeek2) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
         */



    }
}