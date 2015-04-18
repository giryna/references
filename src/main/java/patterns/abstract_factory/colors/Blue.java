package patterns.abstract_factory.colors;

import patterns.abstract_factory.interfaces.Color;

/**
 * Created by taras on 4/18/15.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method");
    }
}
