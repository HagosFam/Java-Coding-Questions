package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Casting {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        Set<Integer> intSet = new HashSet<>();

        strings.add("Name");
        strings.add("Name");

        List<Integer> integers = new ArrayList<>();
        integers.add(6);
        integers.add(6);
        integers.add(7);
        integers.add(7);
        integers.add(7);
        integers.add(8);
        integers.add(8);
        integers.add(9);

        for (Integer intt: integers) {
            intSet.add(intt);
        }
        System.out.println("Printing..... ");
        System.out.println(intSet);

        List<Integer> integerList = integers.stream().distinct().collect(Collectors.toList());
        integerList.forEach(x->System.out.println(x));

        // Scope operator = used for method references
        // it allows you to refer to methods or constructors without invoking them, used for more concise and clean code.

    }
}
