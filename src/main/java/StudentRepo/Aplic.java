package StudentRepo;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;


public class Aplic {
    TreeSet<Student> Students = new TreeSet<>(new NameComparator());
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy.HH:mm:ss");
    String timeStamp = df.format(new Date());


    public String addStudent(String firstName, String lastName, int year, Month mount, String day,
                           Gender gender, String cnp) {

        Student student = new Student(firstName, lastName, day, mount, year, gender, cnp);

        if (student.firstName.isEmpty() || student.lastName.isEmpty()) {
            String s1 = timeStamp + " - First name or last name cannot be empty";
            System.out.println(s1);
            return s1;

        } else if ((year < 1900) || ((Year.now().getValue() - 18) < year)) {
            String s2 = timeStamp + " - This person is too young or too old to be a student";
            System.out.println(s2);
            return s2;

        } else if ((cnp.length() != 13) || cnp.contains("[a-zA-Z]")) {
            String s3 = "CNP incorrect";
            System.out.println(s3);
            return s3;
        } else {
            Students.add(student);
            String s4 = timeStamp + " - " + student.firstName + " "
                    + student.lastName + " - is a new student";
            System.out.println(s4);
            return s4;
        }
    }
    public String listAllStudents(){
        for (Student nextStudent : Students ){
            if(nextStudent.cnp != null ) {
                System.out.println(nextStudent);
            }
        }
        return "All students listed";

    }

    public String removeStudent(String cnp){

        for (Student nextStudent : Students) {
            if (Objects.equals(nextStudent.cnp, cnp)) {
            nextStudent.cnp = null;
            String s6 = "Student " + nextStudent.firstName + " " + nextStudent.lastName + " was removed.";
            System.out.println(s6);
            }
        }
        return null;
    }

    public void listStudentsAtAgeOf(String age) {
        for (Student nextStudent : Students) {
            LocalDate birthDate = LocalDate.parse(nextStudent.studentBirthday());
            Period p = Period.between(birthDate, LocalDate.now());
            if(age.equals(p.toString().substring(1,3))) {
                System.out.println(nextStudent.firstName + " is " + age + " years old.");
            }
        }

    }
}
