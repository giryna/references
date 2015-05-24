package java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        // this is an operation pipeline
        myList
                .stream()
                .filter(listItem -> listItem.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        final List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("David", 12));

        // filter all persons starting with "p" and get them into a list
        final List<Person> filtered =
                persons
                        .stream()
                        .filter(person -> person.name.startsWith("P"))
                        .collect(Collectors.toList());

        System.out.println(filtered);    // [Peter, Pamela]

        // groups all persons by age
        final Map<Integer, List<Person>> personsByAge = persons
                .stream()
                .collect(Collectors.groupingBy(person -> person.age));

        personsByAge
                .forEach((age, person) -> System.out.format("age %s: %s\n", age, person));

        // get average age
        final Double averageAge = persons
                .stream()
                .collect(Collectors.averagingInt(person -> person.age));

        System.out.println(averageAge);     // 19.0

        // get summarized statistics
        final IntSummaryStatistics ageSummary =
                persons
                        .stream()
                        .collect(Collectors.summarizingInt(p -> p.age));

        System.out.println(ageSummary);

        // join into a single string
        final String phrase = persons
                .stream()
                .filter(person -> person.age >= 18)
                .map(person -> person.name)
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

        System.out.println(phrase);

        // transform into a map
        final Map<Integer, String> map = persons
                .stream()
                .collect(Collectors.toMap(
                        person -> person.age,
                        person -> person.name,
                        (name1, name2) -> name1 + ";" + name2));

        System.out.println(map);
    }
}
