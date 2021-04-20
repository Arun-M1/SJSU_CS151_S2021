/**
 *
 * @author Arun Murugan
 */
public class Hexagon extends Shape{

    private double length;
    
    public Hexagon(double length) {
        this.length = length;
        this.setName("Hexagon");
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
    
    @Override
    public double computeArea() {
        return 0.5 * (3 * Math.sqrt(3)) * Math.pow(length, 2);
    }
    
    @Override
    public String toString() {
        return "Name: "  + this.getName() + " with a length of a side: " + length;
    }
    
    
}
