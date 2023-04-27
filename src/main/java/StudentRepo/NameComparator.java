package StudentRepo;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2){
        return (student1.firstName).compareTo(student2.firstName);
    }
}
