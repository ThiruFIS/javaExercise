public class Casting {
    public static void main(String args[]) {
            int x = (int)1.0;
            short y = (short)32768 ;
            int z = (int)9l;
            long t = 192301398193810323L;

            int a = 2147483647;
            a = a + 1;

            System.out.println(y);
            System.out.println(t);
            System.out.println(a);
    }
}
