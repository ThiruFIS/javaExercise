
public class Switch {
    public static void main(String args[]) {

        // Test Case 1
        System.out.println("Test Case 1");
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
        System.out.println("Test Case 2");
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

        // Test Case 3
        System.out.println("Test Case 3");
        int dayOfWeek3 = 0;
        switch(dayOfWeek3) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
            case 6:
                System.out.println("Saturday");
                break;
        }

        // Test Case 4
        System.out.println("Test Case 4");
        int dayOfWeek4 = 9;
        switch(dayOfWeek4) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}