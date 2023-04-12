package StudentRepo;

public class Student extends Birthday {

    private String firstName;
    private String lastName;
    private Gender gender;
    private int cnp;

    public Student( String firstName, String lastName, int day, Month mount, int year,
                    Gender gender, int cnp) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cnp = cnp;
    }

    public String toString(){
        String s1 = firstName + " " + lastName + "; Day of birth: " +
                super.toString() + "; " + gender + "; CNP: " + cnp;
        return s1;
    }
}
