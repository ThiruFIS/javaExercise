/* Implementing Functional Interface
    1. A Lambda expression implements a functional Interface
    2. What is a functional Interface
        a. It should be an interface
        b. it should have only one abstract method
        c. Default and static methods do not count
    3. Lambda Expression is not another way of writing instances of anonymous class
    4. Annotation for FunctionalInterface is not mandatory, to tell compiler its is an functional interface
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpression {

    public static void main(String[] args)
    {

        // ----- Supplier Functional Interface
        Supplier<String> supplier = () -> "Supplier Functional Interface!";
        String string = supplier.get();
        System.out.println( "Supplier print = " + string);

        // ----- Consumer Functional Interface
        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept("Consumer Functional interface");

        // For Multiple Lines of Functional Interface
        Consumer<Integer> consumer2 = (Integer t) -> {
        System.out.println(t.toString());
        System.out.println("Second Line" + t.toString());
        };
        consumer2.accept(3);

        // ----- Predicate Functional Interface
        // -- Any type of object and will do some action on that object and will return an Boolean
        // -- Mainly used in Filtering options of Stream API
        List<String> listString = new ArrayList<>(Arrays.asList("One", "two", "three"));

        Predicate<String> filter = predictionString1 -> predictionString1.startsWith("t");
        listString.removeIf(filter);
        Consumer<String> action = (String predictionString1) -> System.out.println("Predicate Functional Interface"+ predictionString1);
        listString.forEach(action);

        // ------ Function Functional Interface
        // -- Extension predicate
        // -- Taken any object and return another object of another type
        Function<Integer, Double> half = a -> a / 2.0;
        System.out.println("Function Functional Interface " + half.apply(10));

    }
}