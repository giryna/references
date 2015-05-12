package java8;

import java.util.ArrayList;
import java.util.List;

public class LambdasDemo {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<String>(){{
            add("str1");
            add("str2");
            add("str3");
        }};

        // using forEach instead of classic loops
        list.forEach(System.out::println);
        list.forEach(listItem -> System.out.println(listItem));
    }
}
