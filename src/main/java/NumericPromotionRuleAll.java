public class NumericPromotionRuleAll {
    public static void main(String args[]) {
        short x = 14;
        float y = 13;
        double z = 30;
        System.out.println("Data type is : " + ((Object)(x * y / z)).getClass().getSimpleName());
    }
}
