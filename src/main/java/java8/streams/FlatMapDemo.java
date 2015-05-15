package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Foo {
    final String name;
    final List<Bar> bars = new ArrayList<>();

    Foo(String name) {
        this.name = name;
    }
}

class Bar {
    final String name;

    Bar(String name) {
        this.name = name;
    }
}

public class FlatMapDemo {

    public static void main(String[] args) {
        final List<Foo> foos = new ArrayList<>();

        // create foos
        IntStream
                .range(1, 4)
                .forEach(i -> foos.add(new Foo("Foo" + i)));

        // create bars
        foos.forEach(barObject ->
                IntStream
                        .range(1, 4)
                        .forEach(i -> barObject.bars.add(new Bar("Bar" + i + " <- " + barObject.name))));

        foos.stream()
                .flatMap(fooObject -> fooObject.bars.stream())
                .forEach(barObject -> System.out.println(barObject.name));
    }
}
