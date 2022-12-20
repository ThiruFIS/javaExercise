/*
    If you run this below code will not print `Constructor` and `Instance initializer`
     because instance of a class is not created.
 */

public class NumberOfSchoolBags {

    private String companyName;
    private String bagSize;

    private int id;

    private static int numberOfSchoolBags = 0;

    public NumberOfSchoolBags(String companyName,
                              String bagSize) {
        companyName = companyName;
        bagSize = bagSize;
        id = ++numberOfSchoolBags;
    }

    public int getID() {
        return id;
    }

    public static int getNumberOfSchoolBags() {
        return numberOfSchoolBags;
    }

}