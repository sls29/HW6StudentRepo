package StudentRepo;

public class Birthday {
    private int day;
    private Month month;
    private int year;

    public Birthday(int day, Month month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

    }
    public String toString(){
        return (day + "-" + month + "-" + year);
    }
}
