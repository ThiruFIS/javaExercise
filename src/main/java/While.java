public class While {
    public static void main(String args[]) {

        // Similar to if-then else statement
        /*
        while (BooleanExpression) {
        // Statement Body
        }
         */

        int bitesOfCheese = 2;
        int roomInBelly = 5;
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese+" pieces of cheese left");
    }
}