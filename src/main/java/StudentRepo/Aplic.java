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


    public void addStudent(String firstName, String lastName, int year, Month mount, String day,
                           Gender gender, String cnp) {

        Student student = new Student(firstName, lastName, year, mount, day, gender, cnp);
        try {
            if (student.firstName.isEmpty() || student.lastName.isEmpty()) {
                throw new IllegalArgumentException();

            } else if ((year < 1900) || ((Year.now().getValue() - 18) < year)) {
                throw new ArithmeticException();

            } else if ((cnp.length() != 13) || cnp.contains("[a-zA-Z]")) {
                throw new NumberFormatException();

            } else {
                Students.add(student);
                String s4 = timeStamp + " - " + student.firstName + " "
                        + student.lastName + " - is a new student";
                System.out.println(s4);

            }

        } catch (NumberFormatException e) {
            System.out.printf(timeStamp + " - CNP incorrect");
        } catch (IllegalArgumentException e) {
            System.out.printf(timeStamp + " - First name or last name cannot be empty");
        } catch (ArithmeticException e) {
            System.out.printf(timeStamp + " - This person is too young or too old to be a student");
        }
    }

        public String listAllStudents() {
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
