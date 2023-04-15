package StudentRepo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.TreeSet;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Aplic {
    TreeSet<Student> Students = new TreeSet<Student>(new NameComparator());
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy.HH:mm:ss");
    String timeStamp = df.format(new Date());
    Logger logger = Logger.getLogger("AppLog");

    public void addStudent(String firstName, String lastName, int day, Month mount, int year,
                           Gender gender, int cnp) {

        Student student = new Student(firstName, lastName, day, mount, year, gender, cnp);

        if (student.firstName.isEmpty() || student.lastName.isEmpty()) {
            System.out.println(timeStamp + " - First name or last name cannot be empty");
            logger.info(timeStamp + " - First name or last name cannot be empty");

        } else if ((year < 1900) || ((Year.now().getValue() - 18) < year)){
            System.out.println(timeStamp + " - Age problem");
            logger.info(timeStamp + " - Age problem");

        } else {
            Students.add(student);
            System.out.println(timeStamp + " - New student added");
            logger.info(timeStamp + " - New student added");
        }
    }
}
