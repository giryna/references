package java8.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class SimplePredicateDemo {
    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();

        for(int i = 0; i <= 10; i++){
            list.add(new Random().nextInt(10));
        }

        // using forEach instead of classic loops
        list.forEach(System.out::println);

        int evenNumbersSum = sumItems(list, p -> p % 2 == 0);
        int oddNumbersSum = sumItems(list, p -> p % 2 != 0);

        System.out.println("even: " + evenNumbersSum + "\nodd: " + oddNumbersSum);
    }

    // using predicate as precondition for some action
    public static int sumItems(List<Integer> list, Predicate<Integer> predicate){
        int sum = 0;

        for(int listItem : list){
            if(predicate.test(listItem)){
                sum += listItem;
            }
        }

        return sum;
    }
}
