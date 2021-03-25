
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Arun Murugan
 */
public class ListManipulator {

    public ArrayList<Integer> sort(ArrayList<Integer> myLst, boolean ascending) {
        if (ascending) {
            Collections.sort(myLst);
        } else {
            Collections.sort(myLst, Collections.reverseOrder());
        }
        return myLst;
    }

    public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
        int min = myLst.get(0);
        int minIndex = 0;
        int max = myLst.get(1);
        int maxIndex = 0;
        for (int i = 0; i < myLst.size(); i++) {
            if (myLst.get(i) < min) {
                min = myLst.get(i);
                minIndex = i;
            }
            if (myLst.get(i) > max) {
                max = myLst.get(i);
                maxIndex = i;
            }
        }
        myLst.set(minIndex, max);
        myLst.set(maxIndex, min);
        return myLst;
    }

    public void table(ArrayList<Integer> myLst) {
        Map<Integer, Integer> tableMap = new TreeMap<>();
        for (Integer val : myLst) {
            if (tableMap.containsKey(val)) {
                int count = tableMap.get(val) + 1;
                tableMap.put(val, count);
            } else {
                tableMap.put(val, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : tableMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    /*public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(2);
        values.add(3);
        values.add(5);
        values.add(5);
        values.add(4);
        values.add(5);

        ListManipulator instance = new ListManipulator();
        instance.sort(values, true);
        for (Integer val : values) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        instance.sort(values, false);
        for (Integer val : values) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        instance.swapLargestSmallest(values);
        for (Integer val : values) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        instance.table(values);
        
    }*/
}
