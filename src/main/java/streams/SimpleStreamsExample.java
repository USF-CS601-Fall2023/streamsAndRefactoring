package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** A simple example demonstrating using streams */
public class SimpleStreamsExample {

    public static void main(String[] args) {
        String[] myStringArray = {"hello", "hola", "privet", "namaste", "ni hao"};

        // Option 1 to create a stream:
        Stream<String> stream1 = Arrays.stream(myStringArray);
        stream1.forEach(s-> System.out.println(s));

        // Option 2 to create a stream (first convert to List):
        List<String> myStringList = Arrays.asList(myStringArray);
        Stream<String> stream2 = myStringList.stream();

        // Option 3 to create a stream
        Stream<String> stream3 = Stream.of("hello", "hola", "privet", "namaste", "ni hao");


        // Operations:
        // sorted, forEach, filter, map...
        //stream2.sorted((s1, s2)-> s1.length()-s2.length()).forEach(s-> System.out.println(appendCharacter(s, '!')));
        //System.out.println();

        // Using filter function
        //stream3.filter(s -> s.contains("h")).forEach(s-> System.out.println(s));
        //System.out.println(stream3.filter(s -> s.contains("h")).count());

        /*List<String> result = stream3.filter(word -> word.length() > 5).filter(s -> s.startsWith("n"))
                .toList();
        result.stream().forEach(s -> System.out.println(s));

        //stream2.map(word -> appendCharacter(word, '!')).forEach(word-> System.out.println(word));

        */
        /* System.out.println(Arrays.asList(1, 2, 3, 4).stream()
                .reduce(0, (x,y) -> x + y));
        */
    }

    public static String appendCharacter(String s, char ch) {
        return s + ch;
    }
}
