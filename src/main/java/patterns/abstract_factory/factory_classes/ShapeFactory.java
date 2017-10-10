package patterns.abstract_factory.factory_classes;

import patterns.abstract_factory.interfaces.Color;
import patterns.abstract_factory.interfaces.Shape;
import patterns.abstract_factory.shapes.Circle;
import patterns.abstract_factory.shapes.Rectangle;
import patterns.abstract_factory.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        switch (shape.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                throw new IllegalArgumentException("Illegal shape specified");
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
