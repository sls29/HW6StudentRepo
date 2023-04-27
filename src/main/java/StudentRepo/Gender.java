package StudentRepo;

public enum Gender {
    FEMALE ("F"),
    MALE ("M"),
    ;
    final String shortName;

    Gender(String shortName) {
        this.shortName = shortName;
    }
}
