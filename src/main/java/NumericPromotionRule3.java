public class NumericPromotionRule3 {
    public static void main(String args[]) {
        char x = 1;
        short y = 33;
        System.out.println("Data type when multiply char and short is : " + ((Object)(x * y)).getClass().getSimpleName());

        byte a = 123;
        Integer b = 134123;
        System.out.println("Data type when multiply byte and Integer is : " + ((Object)(a + b)).getClass().getSimpleName());
    }
}
