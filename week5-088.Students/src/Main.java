
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        String name;
        String studentNumber;
        
        // Read in student names and numbers
        System.out.print("Name: ");
        name = reader.nextLine();
        
        // Add students (objects) to list
        while (!name.isEmpty()) {
            System.out.print("Student Number: ");
            studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
            System.out.print("Name: ");
            name = reader.nextLine();
        }
        
        // Print list of students
        for (Student student : list) {
            System.out.println(student);
        }
        
        // Search for students by name
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        
        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}