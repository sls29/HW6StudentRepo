package StudentRepo;

public class Student {

    private String firstName;
    private String lastName;
    private Birthday birthDay;
    private Gender gender;
    private int cnp;

    public Student( String firstName, String lastName, Birthday birthDay,
                    Gender gender, int cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.cnp = cnp;
    }

    public String toString(){
        String s1 = firstName + " " + lastName + "; Day of birth: " +
                birthDay + "; " + gender + "; CNP: " + cnp;
        return s1;
    }
}
