/*
    If you run this below code its printed `Constructor` and `Instance initializer`
    So always order of initialization is
        1. Fields and instance initializer blocks are executed in order in which they
            appear in file
        2. The constructor runs after all fields and instance initializers blocks have run.
 */

public class InstanceInitializerWithObjInstance {

    String printVariable;

    // Instance Initializer - 1 - Code of a block outside method
    {printVariable = "InstanceInitializer1";System.out.println( printVariable);}

    // Instance Initializer - 2
    {printVariable = "InstanceInitializer2";System.out.println( printVariable);}

    public static void main(String args[]) {
        InstanceInitializerWithObjInstance a = new InstanceInitializerWithObjInstance();
         System.out.println("main");
    }

    // Constructor
    InstanceInitializerWithObjInstance() {
        printVariable = "Constructor";
        System.out.println( printVariable);
    }

    // Instance Initializer - 3
    {printVariable = "InstanceInitializer3";System.out.println( printVariable);}

}