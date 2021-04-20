/**
 *
 * @author Arun Murugan
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
        this.setName("Circle");
    }
    
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public String toString() {
        return "Name: "  + this.getName() + " with a radius: " + radius;
    }

}
