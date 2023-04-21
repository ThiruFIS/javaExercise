public class StringMethods {
    public static void main(String args[]) {

        // Test case for CharAT
        String name = "FIS";
        System.out.println("charAt - Statement - 1 - " +name.charAt(0)); // Statement 1
        System.out.println("charAt - Statement - 1 - " +name.charAt(2)); // Statement 2
        //System.out.println(name.charAt(3)); // Statement 3

        // Test case for IndexOf
        String authorName = " Thiru";
        System.out.println("Indexof - Statement - 1 - " +authorName.indexOf(0)); // Statement 1
        System.out.println("Indexof - Statement - 2 - " +authorName.indexOf(" ")); // Statement 2
        System.out.println("Indexof - Statement - 3 - " +authorName.indexOf("h")); // Statement 3
        System.out.println("Indexof - Statement - 4 - " +authorName.indexOf("Z")); // Statement 4
        System.out.println("Indexof - Statement - 5 - " +authorName.indexOf("hi")); // Statement 5
        System.out.println("Indexof - Statement - 6 - " +authorName.indexOf("hi",3)); // Statement 6
        System.out.println("Indexof - Statement - 7 - " +authorName.indexOf("r",3)); // Statement 7

        // Test case for subString
        System.out.println("subString - Statement - 1 - " +authorName.substring(1)); // Statement 1
        System.out.println("subString - Statement - 2 - " +authorName.substring( authorName.indexOf(" "))); // Statement 2
        System.out.println("subString - Statement - 3 - " +authorName.substring(3, 4)); // Statement 3
        System.out.println("subString - Statement - 4 - " +authorName.substring(3, 3)); // Statement 4
        //System.out.println("subString - Statement - 5 - " +authorName.substring(3, 2)); // Statement 5
        //System.out.println("subString - Statement - 6 - " +authorName.substring(3, 7)); // Statement 6

        // Test case for toLowerCase() and toUpperCase()
        System.out.println("toLowerCase - Statement - 1 - " +authorName.toLowerCase()); // Statement 1
        System.out.println("toUpperCase - Statement - 2 - " +authorName.toUpperCase()); // Statement 2
        // Remember original String remains Same because Strings are immutable

        // Test case of equals() and equalsIgnoreCase()
        System.out.println("equals - Statement - 1 - " +authorName.equals(" Thiru")); // Statement 1
        System.out.println("equals - Statement - 2 - " +authorName.equals(" Thiu")); // Statement 2
        System.out.println("equalsIgnoreCase - Statement - 3 - " +authorName.equalsIgnoreCase(" thiru")); // Statement 3

        // Test case of StartsWith() and endsWith()
        System.out.println("StartsWith - Statement - 1 - " +authorName.startsWith(" ")); // Statement 1
        System.out.println("endsWith - Statement - 2 - " +authorName.endsWith("U")); // Statement 2
        System.out.println("endsWith - Statement - 3 - " +authorName.endsWith("u")); // Statement 3

        // Test case of Contains()
        System.out.println("Contains - Statement - 1 - " +authorName.contains(" ")); // Statement 1
        System.out.println("Contains - Statement - 2 - " +authorName.contains("ru")); // Statement 2
        System.out.println("Contains - Statement - 2 - " +authorName.contains("RU")); // Statement 3

        // Test case of replace()
        System.out.println("replace - Statement - 1 - " +authorName.replace(" ", " T")); // Statement 1
        System.out.println("replace - Statement - 2 - " +authorName.replace("h", "H")); // Statement 2

        // Test case of trim()
        System.out.println("trim - Statement - 1 - " +authorName.trim()); // Statement 1
        String a = "\tFIS\n\r";
        System.out.println("trim1 - Print Statement - 2 - " +a); // Statement 2
        System.out.println("trim1 - Statement - 2 - " +a.trim()); // Statement 2

        String b = "\tFIS\n";
        System.out.println("trim2 - Print Statement - 3 - " +b); // Statement 3
        System.out.println("trim2 - Statement - 3 - " +b.trim()); // Statement 3

        // Test case for method Chaining
        String result = " Thiru ".trim().toLowerCase().replace('h', 'H');
        System.out.println("MethodChaining - Statement 1 - " + result); // Statement 3
    }
}
