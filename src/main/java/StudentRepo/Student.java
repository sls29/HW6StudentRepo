package StudentRepo;

public class Student extends Birthday {

    protected String firstName;
    protected String lastName;
    protected Gender gender;
    protected String cnp;

    public Student(String firstName, String lastName, String day, Month month, int year,
                   Gender gender, String cnp) {
        super(day, month, year);
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cnp = cnp;
    }

    public String studentBirthday(){
        return super.toString();
    }
    public String toString(){
        return firstName + " " + lastName + "; Day of birth: " +
                super.toString() + "; " + gender + "; CNP: " + cnp;

    }
}
