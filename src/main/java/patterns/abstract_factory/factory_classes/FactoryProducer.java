package patterns.abstract_factory.factory_classes;

/**
 * Creates objects of AbstractFactory class
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String id) {
        switch (id.toLowerCase()) {
            case "shape":
                return new ShapeFactory();
            case "color":
                return new ColorFactory();
            default:
                throw new IllegalArgumentException("Illegal factory specified");
        }

    }
}
