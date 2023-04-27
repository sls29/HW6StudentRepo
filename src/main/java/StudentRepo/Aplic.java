package StudentRepo;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;


public class Aplic {
    TreeSet<Student> Students = new TreeSet<>(new NameComparator());
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
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
            System.out.println(timeStamp + " - CNP incorrect");
        } catch (IllegalArgumentException e) {
            System.out.println(timeStamp + " - First name or last name cannot be empty");
        } catch (ArithmeticException e) {
            System.out.println(timeStamp + " - This person is too young or too old to be a student");
        }
    }

        public String listAllStudents() {
            System.out.println(" --- Students List --- ");
        for (Student nextStudent : Students ){
            if(nextStudent.cnp != null ) {
                System.out.println(nextStudent);
            }
        }
            System.out.println(" ");
        return "All students listed";

    }

    public void removeStudent(String cnp){
        int stud = 0;
        try {
            if (cnp.length() != 13 || cnp.contains("[a-zA-Z])")) {
                throw new IllegalArgumentException();
            }

            for (Student nextStudent : Students) {

                if (Objects.equals(nextStudent.cnp, cnp)) {
                    stud += 1;
                    nextStudent.cnp = null;
                    System.out.println(timeStamp + " Student " + nextStudent.firstName +
                            " " + nextStudent.lastName + " was removed.");

                }
            }
            if (stud == 0){
                System.out.println(timeStamp + " Student not found ");
            }

        } catch(IllegalArgumentException e){
            System.out.println(timeStamp + " CNP is invalid");
        }
    }

    public void listStudentsAtAgeOf(String age) {
        int stud = 0;
        for (Student nextStudent : Students) {
            LocalDate birthDate = LocalDate.parse(nextStudent.studentBirthday());
            Period p = Period.between(birthDate, LocalDate.now());
            if(age.equals(p.toString().substring(1,3))) {
                stud += 1;
                System.out.println(timeStamp + " " + nextStudent.firstName + " is " + age + " years old.");
            }
        }
        if(stud == 0) {
            System.out.println(timeStamp + " None of our students is " + age + " old");
        }
    }
}
