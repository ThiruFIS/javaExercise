public class ForEachStatement {

    public static void main(String args[]) {

        // Test Case 1
        System.out.println(" Test Case 1");
        final String[] names = new String[3];
        names[0] = "FIS";
        names[1] = "ING";
        names[2] = "ABN";
        for(String name : names) {
            System.out.println(name);
        }
    }
}
