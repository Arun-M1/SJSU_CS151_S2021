
import java.util.List;

/**
 *
 * @author Arun Murugan
 */
public class ShapeTest implements Runnable {

    private Shapes shapes = new Shapes();

    public static void main(String[] args) {
        
        Shape triangle1 = new Triangle(1.0, 2.0);
        Shape triangle2 = new Triangle(1.0, 3.0);
        Shape rectangle1 = new Rectangle(1.0, 2.0);
        Shape rectangle2 = new Rectangle(1.0, 3.0);
        Shape circle1 = new Circle(1.0);
        Shape circle2 = new Circle(2.0);
        Shape hexagon1 = new Hexagon(1.0);
        Shape hexagon2 = new Hexagon(2.0);

        ShapeTest test = new ShapeTest();
        test.shapes.add(triangle1);
        test.shapes.add(triangle2);

        ShapeTest test1 = new ShapeTest();
        test1.shapes.add(rectangle1);
        test1.shapes.add(rectangle2);

        ShapeTest test2 = new ShapeTest();
        test2.shapes.add(circle1);
        test2.shapes.add(circle2);

        ShapeTest test3 = new ShapeTest();
        test3.shapes.add(hexagon1);
        test3.shapes.add(hexagon2);

        Thread threadObj0 = new Thread(test);
        Thread threadObj1 = new Thread(test1);
        Thread threadObj2 = new Thread(test2);
        Thread threadObj3 = new Thread(test3);

        threadObj0.start();
        threadObj1.start();
        threadObj2.start();
        threadObj3.start(); 
        
        findShapeMinAndMax(); 
        
    }

    private static void findShapeMinAndMax(){
        Shape triangle1 = new Triangle(1.0, 2.0);
        Shape triangle2 = new Triangle(1.0, 3.0);
        Shape rectangle1 = new Rectangle(1.0, 2.0);
        Shape rectangle2 = new Rectangle(1.0, 3.0);
        Shape circle1 = new Circle(1.0);
        Shape circle2 = new Circle(2.0);
        Shape hexagon1 = new Hexagon(1.0);
        Shape hexagon2 = new Hexagon(2.0);
        
        ShapeTest allShapes = new ShapeTest();
        allShapes.shapes.add(triangle1);
        allShapes.shapes.add(triangle2);
        allShapes.shapes.add(rectangle1);
        allShapes.shapes.add(rectangle2);
        allShapes.shapes.add(circle1);
        allShapes.shapes.add(circle2);
        allShapes.shapes.add(hexagon1);
        allShapes.shapes.add(hexagon2);
        
        Shape big = allShapes.shapes.max();
        System.out.println("Biggest shape: " + big.toString());
        Shape small = allShapes.shapes.min();
        System.out.println("Smallest shape: " + small.toString());
    }

    @Override
    public void run() {
        shapes.compute();
    }

}
