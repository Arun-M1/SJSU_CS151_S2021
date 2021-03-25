
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Driver class for Person class
 *
 * @author Arun Murugan
 */
public class PersonTest {

    private static ArrayList<Person> people = new ArrayList<Person>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createPeopleList();
        sortPeople("ascending", "firstname");
        displayPeople("Firstname-Ascending");
        sortPeople("descending", "firstname");
        displayPeople("Firstname-descending");
        sortPeople("ascending", "lastname");
        displayPeople("Lastname-ascending");
        sortPeople("descending", "lastname");
        displayPeople("Lastname-descending");
        sortPeople("ascending", "age");
        displayPeople("Age-ascending");
        sortPeople("descending", "age");
        displayPeople("Age-descending");

    }
    
    private static void createPeopleList() {
        Person joe = new Person("Joe", "Smith", 40);
        Person amy = new Person("Amy", "Gold", 32);
        Person tony = new Person("Tony", "Stark", 21);
        Person sean = new Person("Sean", "Irish", 24);
        Person tina = new Person("Tina", "Brock", 28);
        Person lenny = new Person("Lenny", "Hep", 18);

        people.add(joe);
        people.add(amy);
        people.add(tony);
        people.add(sean);
        people.add(tina);
        people.add(lenny);
    }

    private static void sortPeople(String order, String sortBy) {
        switch (sortBy.toLowerCase()) {
            case "firstname":
                if (order.equalsIgnoreCase("descending")) {
                    people.sort(Comparator.comparing(Person::getFirstName).reversed());
                } else {
                    people.sort(Comparator.comparing(Person::getFirstName));
                }
                break;
            case "lastname":
                if (order.equalsIgnoreCase("descending")) {
                    people.sort(Comparator.comparing(Person::getLastName).reversed());
                } else {
                    people.sort(Comparator.comparing(Person::getLastName));
                }
                break;
            case "age":
                if (order.equalsIgnoreCase("descending")) {
                    people.sort(Comparator.comparing(Person::getAge).reversed());
                } else {
                    people.sort(Comparator.comparing(Person::getAge));
                }
                break;
        }
    }
    
    private static void displayPeople(String sortBy) {
        System.out.println("SortBy: " + sortBy);
        for(Person p: people) {
            System.out.println(p);
        }
        System.out.println();
    }
}
