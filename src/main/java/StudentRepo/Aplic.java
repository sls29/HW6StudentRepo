package StudentRepo;

import java.time.Year;
import java.util.TreeSet;

public class Aplic {
    TreeSet<Student> Students = new TreeSet<Student>(new NameComparator());

    public void addStudent(String firstName, String lastName, int day, Month mount, int year,
                           Gender gender, int cnp) {

        Student student = new Student(firstName, lastName, day, mount, year, gender, cnp);


        if (student.firstName.isEmpty() || student.lastName.isEmpty()) {
            System.out.println("First name or last name cannot be empty");

        } else if ((year < 1900) || ((Year.now().getValue() - 18) < year)){
            System.out.println("Age problem");

        } else {
            Students.add(student);
            System.out.println("New student added");
        }
    }
}
