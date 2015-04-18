package patterns.abstract_factory.shapes;

import patterns.abstract_factory.interfaces.Shape;

/**
 * Created by taras on 4/18/15.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
