public class DoWhile {
    public static void main(String args[]) {

        /*
        do {
        }
        while (BooleanExpression);
         */

        int bitesOfCheese = 2;
        do {
            System.out.println(bitesOfCheese+ " Execute do Command");
            bitesOfCheese--;
        }
        while (bitesOfCheese > 0);
    }
}