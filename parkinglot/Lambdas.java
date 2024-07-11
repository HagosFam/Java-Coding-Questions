package parkinglot;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambdas {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.ofNullable("null"); // null value, "" is just empty string, not null
        Optional<Integer> optionalInteger = Optional.ofNullable(0);
        Optional<String> optional = Optional.empty(); // empty value.
        // it is a class that we use to handle nullable values
        // used a way to deal with optional values

// it also helps to give default value if the optional is empty

        // How do we acees the value
       // String str = optionalString.get(); // we can get the value, but now // get won't work because it has to have a value

        String strNull = optionalString.orElse("Other value"); // When we provide a default value
        String strElseGet = optionalString.orElseGet(()->"From supplier "); // When we get a defalut value from supplier
       // String strThrow = optionalString.orElseThrow(()-> new RuntimeException()); // we can make it to throw a runtime exception

        // we can even use this with streams
        String strMap = optionalString.map(x->x + "mapped").toString();
        System.out.println(strMap);


       // System.out.println(str);
        System.out.println(strNull);
        System.out.println(strElseGet);
    }

}
