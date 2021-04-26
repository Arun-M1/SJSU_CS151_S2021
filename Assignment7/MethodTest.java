
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arun Murugan
 */
public class MethodTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        
        count(list1);
        
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < 6; i++) {
            list2.add(i);
        }  
        count(list2);
        
        List<Double> list3 = new ArrayList<>();
        for(int i = 0; i < 8; i++) {
            list3.add((double)i);
        }
        count(list3);
        
        
    }
    
    public static <T> void count(List<T> list) {
        int count = 0;
        for(int i = 0; i < list.size(); i++) {
            count++;
        }
        System.out.println("There are " + count + " objects in this list.");
    }
    
}
