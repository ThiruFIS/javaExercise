public class divideNumbers {

    public static void main(String args[]) {
        int x=0, y = 10;

        try {
            y /=x;
            x = y / x;
            System.out.println( "error" + y + x);
            }
        catch(Exception e) {
            System.out.println( "Divide by Zero");
            System.out.println( "error");
        }
    }

}
