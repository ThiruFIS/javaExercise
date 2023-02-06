public class StaticInitializerWithObjInstance {

    static {
        String printVariable;
        printVariable = "staticInitializer1";
        System.out.println( printVariable);
    }

    public static void main(String args[]) {
        System.out.println("main");
    }

    // Constructor
    StaticInitializerWithObjInstance() {
        System.out.println( "Constructor");
    }

}