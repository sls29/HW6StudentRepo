package StudentRepo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;


public class Aplic {
    TreeSet<Student> Students = new TreeSet<Student>(new NameComparator());
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy.HH:mm:ss");
    String timeStamp = df.format(new Date());


    public String addStudent(String firstName, String lastName, int day, Month mount, int year,
                           Gender gender, Double cnp) {

        Student student = new Student(firstName, lastName, day, mount, year, gender, cnp);

        if (student.firstName.isEmpty() || student.lastName.isEmpty()) {
            String s1 = timeStamp + " - First name or last name cannot be empty";
            System.out.println(s1);
            return s1;

        } else if ((year < 1900) || ((Year.now().getValue() - 18) < year)){
            String s2 = timeStamp + " - This person is too young or too old to be a student";
            System.out.println(s2);
            return s2;

        } else {
            Students.add(student);
            String s3 = timeStamp + " - " + student.firstName + " "
                    + student.lastName + " - is a new student";
            System.out.println(s3);
            return s3;
        }
    }
    public String listAllStudents(){
        for (Student nextStudent : Students ){
            if(nextStudent.cnp != null ) {
                System.out.println(nextStudent);
            }
        }
        String s1 = "All students listed";
        return s1;
    }

    public String removeStudent(Double cnp){
        String firstName = null;
        String lastName = null;
        String s1 = null;
        for (Student nextStudent : Students) {
            if (Objects.equals(nextStudent.cnp, cnp)) {
            nextStudent.cnp = null;
            firstName = nextStudent.firstName;
            lastName = nextStudent.lastName;
            s1 = "Student " + firstName + " " + lastName + " was deleted.";
            System.out.println(s1);
            }
        }
        return s1;
    }

}
