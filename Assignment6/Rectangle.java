/**
 *
 * @author Arun Murugan
 */
public class Rectangle extends Shape {
    
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.setName("Rectangle");
    }
    
     /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public double computeArea() {
        return length * width;
    }
    
    @Override
    public String toString() {
        return "Name: "  + this.getName() + " with length: " + length + " and width: " + width;
    }
}
