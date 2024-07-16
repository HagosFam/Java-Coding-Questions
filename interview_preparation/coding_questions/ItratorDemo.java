package interview_preparation.coding_questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Str1");
        list.add("Str2");

        Iterator<String> stringIterator = list.iterator();
        // ConcurrentModificationException

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        // iterator



    }
}
