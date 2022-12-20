/*
    If you run this below code will not print `Constructor` and `Instance initializer`
     because instance of a class is not created.
 */

public class InstanceInitializerWithoutObjInstance {

    // Instance Initializer
    {printVariable = "InstanceInitializer";System.out.println( printVariable);}

    static String printVariable;

    public static void main(String args[]) {
        { System.out.println("main"); }
    }

    // Constructor
    InstanceInitializerWithoutObjInstance() {
        printVariable = "Constructor";
        System.out.println( printVariable);

    }

}