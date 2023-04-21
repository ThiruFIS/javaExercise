public class MutableString1 {
    public static void main(String args[]){

        // -- First Test case for Mutable String
        MutableString mutable = new MutableString();
        // Please note Mutable is an Innerclass here
        MutableString.Mutable innerClassMutable = mutable.new Mutable();
        innerClassMutable.setS("Thiru");
        System.out.println("Mutable :" + innerClassMutable.getS());
        // Now Going to update name Thiru to different name
        innerClassMutable.setS("FIS");
        System.out.println("Mutable :" + innerClassMutable.getS());

        // -- Second Test case for Immutable String
        MutableString immutable = new MutableString();
        // Please note Mutable is an Innerclass here
        MutableString.Immutable innerClassImmutable = immutable.new Immutable();
        System.out.println("Immutable :" + innerClassImmutable.getS());
    }
}