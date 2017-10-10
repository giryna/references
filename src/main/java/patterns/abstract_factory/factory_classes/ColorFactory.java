package patterns.abstract_factory.factory_classes;

import patterns.abstract_factory.colors.Blue;
import patterns.abstract_factory.colors.Green;
import patterns.abstract_factory.colors.Red;
import patterns.abstract_factory.interfaces.Color;
import patterns.abstract_factory.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        switch (color.toLowerCase()) {
            case "red":
                return new Red();
            case "green":
                return new Green();
            case "blue":
                return new Blue();
            default:
                throw new IllegalArgumentException("Illegal color specified");
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
