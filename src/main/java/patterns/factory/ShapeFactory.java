package patterns.factory;

/**
 * Created by toleks on 9/4/2014.
 */
public class ShapeFactory {

    public Shape getShape(String shapeString){

        // switch statement on strings enabled in java 7 only
        if (shapeString.equals("circle")) {
            return new Circle();
        } else if (shapeString.equals("rectangle")) {
            return new Rectangle();
        } else if (shapeString.equals("square")) {
            return new Square();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String args[]){

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");

        shape.draw();

    }
}
