package patterns.abstract_factory;

import patterns.abstract_factory.factory_classes.AbstractFactory;
import patterns.abstract_factory.factory_classes.FactoryProducer;
import patterns.abstract_factory.interfaces.Color;
import patterns.abstract_factory.interfaces.Shape;

/**
 * Abstract Factory patterns work around a super-factory which creates other factories.
 * In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes.
 * Each generated factory can give the objects as per the Factory pattern.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {

        final AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        final Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        final Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        final Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        final AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        final Color color1 = colorFactory.getColor("RED");
        color1.fill();

        final Color color2 = colorFactory.getColor("Green");
        color2.fill();

        final Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}
