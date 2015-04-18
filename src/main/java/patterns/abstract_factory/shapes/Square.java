package patterns.abstract_factory.shapes;

import patterns.abstract_factory.interfaces.Shape;

/**
 * Created by taras on 4/18/15.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
