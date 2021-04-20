import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Arun Murugan
 */
public class Shapes {
    private List<Shape> shapeList;
    
    public Shapes() {
        shapeList = new ArrayList<>();
    }
    
    public void setShapesList(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public List getShapeList() {
        return shapeList;
    }
    
    public void add(Shape shape) {
        shapeList.add(shape);
    }
    
    public void remove(Shape shape) {
        shapeList.remove(shape);
    }
    
    public synchronized void compute() {
        for(Shape s : shapeList) {
            System.out.println(s.getName() + " area: " + s.computeArea());
        }
    }   
    
    public Shape max() {
        //return shape with biggest area
        double max = 0;
        Shape big = null;
        for(Shape s : shapeList) {
            if(max < s.computeArea()) {
                max = s.computeArea();
                big = s;
            }
        }
        return big;
    }
    
    public Shape min() {
        double min = shapeList.get(0).computeArea();
        Shape small = shapeList.get(0);
        for(int i = 1; i < shapeList.size(); i++) {
            if(shapeList.get(i).computeArea() < min) {
                min = shapeList.get(i).computeArea();
                small = shapeList.get(i);
            }
        }
        return small;
    }
    
}
