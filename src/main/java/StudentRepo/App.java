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
        TreeSet<Student> students = new TreeSet<Student>();


        students.add( new Student("John", "Doe", 10, Month.JANUARY,
                        2001, MALE, 1234567890));
    }
}
