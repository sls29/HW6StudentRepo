package StudentRepo;

import java.util.TreeSet;

import static StudentRepo.Gender.MALE;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Aplic aplic = new Aplic();


        aplic.addStudent("John", "Doe", 10, Month.JANUARY,
                        2001, MALE, 1234567890);

        aplic.addStudent("", "",10, Month.JANUARY,
                2001, MALE, 1234567890);

        aplic.addStudent("Do", "Re", 10, Month.JANUARY,
                2012, MALE, 1234567890);

    }
}
