import java.util.Scanner;
import java.util.*;
public class collection {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }


}
