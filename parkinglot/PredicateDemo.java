package parkinglot;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class PredicateDemo {
    // a functional interface
    // has one method, function, called test(T t)
    // funcaitonal interfaces are generics, they can work with different data types without the need of casting.

    // demo
    public static void main(String[] args) {

        // creating a predicate
        Predicate<String> stringPredicate = x->x.length() > 10;

        // testing a predicate
        boolean result = stringPredicate.test("I love home depot");

        // creating a predicate
        BiFunction<String, String, Integer > stringIntegerBiFunction = (x, y) -> x.length()+y.length();

        // testing a predicate
        int integer = stringIntegerBiFunction.apply("one", "two");
        System.out.println(integer);

        // printing the result
        // printing amazing result for the main thing
        System.out.println(result);
    }
}
