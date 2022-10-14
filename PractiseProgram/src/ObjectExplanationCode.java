import java.util.Arrays;

public class ObjectExplanationCode {

    String name;

    public static void main (String[] args) {
        ObjectExplanationCode dog1 = new ObjectExplanationCode();
        dog1.bark();
        dog1.name = "thiru";

        ObjectExplanationCode[] dog2 = new ObjectExplanationCode[3];
        dog2[0] = new ObjectExplanationCode();
        dog2[1] = new ObjectExplanationCode();

        // Sample if condition to show dog2[2] is null before set new ObjectExplanationCode()
        if (dog2[2] == null) {
            System.out.println("yes its Null");
        }
        else {
            System.out.println("No its not Null");
        }

        dog2[2] = new ObjectExplanationCode();

        dog2[0].name = "Rakshan";
        dog2[1].name = "Jaayshri";
        dog2[2].name = "Thirumurugan";

        int x = 0;
        while(x < dog2.length) {
            dog2[x].bark();
            x = x + 1;
        }
    }

    void bark() {
        System.out.println( name + "says buff");
    }

}
