package StudentRepo;

import java.io.IOException;
import java.util.TreeSet;
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

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Aplic aplic = new Aplic();

        aplic.addStudent("John", "Doe", 10, Month.JANUARY,
                2001, MALE, 123456789);
        logger.info(aplic.addStudent("John", "Doe", 10, Month.JANUARY,
                2001, MALE, 123456789));

        aplic.addStudent("Lita", "Ford", 21, Month.APRIL,
                1994, MALE, 123456789);
        logger.info(aplic.addStudent("Lita", "Ford", 21, Month.APRIL,
                1994, FEMALE, 223426789));

        aplic.addStudent("", "",10, Month.AUGUST,
                2001, MALE, 123456789);
        logger.info(aplic.addStudent("", "",10, Month.AUGUST,
                2001, MALE, 123456789));

        aplic.addStudent("Do", "Re", 10, Month.DECEMBER,
                2012, MALE, 123456789);
        logger.info(aplic.addStudent("Do", "Re", 10, Month.DECEMBER,
                2012, MALE, 123456789));
    }
}
