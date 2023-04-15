package StudentRepo;

public enum Gender {
    FEMALE ("F"),
    MALE ("M"),
    ;
    String shortName;

    Gender(String shortName) {
        this.shortName = shortName;
    }
}
