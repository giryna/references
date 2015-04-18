package patterns.abstract_factory.factory_classes;

import patterns.abstract_factory.interfaces.Color;
import patterns.abstract_factory.interfaces.Shape;

/**
 * Provides an abstract for creating objects of Shape and Color classes
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
