public class CatchException {

    public static void parse(String str) {
        try {
                float f = Float.parseFloat(str);
            }
            catch (NumberFormatException nfe) {
                System.out.println("Catched1");
                } finally {
                System.out.println("Finally");
            }
        }

    public static void main(String args[]) {
            parse("df");
        }
    }