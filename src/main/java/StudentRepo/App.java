package StudentRepo;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static StudentRepo.Gender.FEMALE;
import static StudentRepo.Gender.MALE;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Logger logger = Logger.getLogger("AppLog");
        FileHandler fh;

        try {
            fh = new FileHandler("./AppLog.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.info("StudentRepo Logs");

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

        Aplic aplic = new Aplic();
        try {
            aplic.addStudent("John", "Doe", 2001, Month.JAN,
                    "10", MALE, "1234567890123");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        aplic.addStudent("Billy", "Joy", 1991, Month.MAR,
                "03", MALE, "1234667890123");


        aplic.addStudent("Lita", "Ford", 1994, Month.APR,
                "21", FEMALE, "2234567890123");

        try {
            aplic.addStudent("", "", 2001, Month.AUG,
                    "24", MALE, "1234567890123");
        } catch (ArithmeticException e) {
            System.out.printf(e.getMessage());
        }

        try {
            aplic.addStudent("Do", "Re", 2002, Month.DEC,
                    "02", MALE, "123456789012");
        } catch (ArithmeticException e) {
            System.out.printf(e.getMessage());
        }

        try {
            aplic.addStudent("Do", "Re", 2012, Month.NOV,
                    "02", MALE, "1234567890123");
        } catch (ArithmeticException e) {
            System.out.printf(e.getMessage());
        }

        aplic.listAllStudents();
        logger.info(aplic.listAllStudents());

        aplic.removeStudent("123456789");
        logger.info(aplic.removeStudent("123456789"));

        aplic.listAllStudents();
        logger.info(aplic.listAllStudents());

        aplic.listStudentsAtAgeOf("22");

        aplic.listStudentsAtAgeOf("28");

        aplic.listStudentsAtAgeOf("19");












    }
}
