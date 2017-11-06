
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> contacts = new ArrayList<Person>();
    
    public void add(String name, String number) {
        Person newPerson = new Person(name, number);
        contacts.add(newPerson);
    }
    
    public void printAll() {
        for (Person p : contacts) {
            System.out.println(p);
        }
    }
    
    public String searchNumber(String name) {
        for (Person p : contacts) {
            if (p.getName().equals(name)) {
                return p.getNumber();
            }
        }
        return "number not known";
    }
}
