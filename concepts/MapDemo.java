package concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Stream<String> stream = list.stream();

        List<String> listt = list.stream().distinct().collect(Collectors.toList());



        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // printing key and value
        System.out.println("Printing key and value");
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() );

        }

    }
}
