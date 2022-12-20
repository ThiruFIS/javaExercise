public class StaticInitializer {

    static String printVariable;

    public static void main(String args[]) {
       printVariable = "main";
       StaticInitializer staticClass = new StaticInitializer();
       staticClass.methodCheck();
    }

    // Constructor
    StaticInitializer() {
        printVariable = "Constructor";
    }

    void methodCheck() {
        printVariable = "method";
    }

}