package StudentRepo;

public enum Month {
    JAN ("01","January", 31),
    FEB ("02","February", 28 ),
    MAR ("03","March", 31),
    APR ("04","April", 30),
    MAY ("05", "May", 31),
    JUN ("06","June", 31),
    JUL ("07","July", 30),
    AUG ("08","August", 31),
    SEP ("09","September", 30),
    OCT ("10","October", 31),
    NOV ("11","November", 30),
    DEC ("12","December", 31),
    ;

    String monthOfYear;
    String name;
    int days;
    Month(String monthOfYear, String name, int days) {
        this.monthOfYear = monthOfYear;
        this.name = name;
        this.days = days;
    }
}
