public class whileLoop {

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6};

        int i = a.length - 1;

        while (i >=0) {
            System.out.println( a[i]);
            i--;
        }
    }

    public static void secret(StringBuilder mystery) {
        char ch = mystery.charAt(3);
        mystery = mystery.insert(1, "more");
        int num = mystery.length();
    }
}
