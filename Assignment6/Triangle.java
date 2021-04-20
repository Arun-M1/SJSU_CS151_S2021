/**
 *
 * @author Arun Murugan
 */
public class Triangle extends Shape {

    private double height;
    private double base;
    
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
        this.setName("Triangle");
    }
    
    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double computeArea() {
        return 0.5 * (height * base);
    }
    
    @Override
    public String toString() {
        return "Name: "  + this.getName() + " with height: " + height + " and base: " + base;
    }
}
