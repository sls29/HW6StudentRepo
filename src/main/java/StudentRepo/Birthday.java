package StudentRepo;

public class Birthday {
    protected String day;
    protected Month month;
    protected int year;

    public Birthday(String day, Month month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

    }
    public String toString(){
        return (year + "-" + month.monthOfYear + "-" + day);
    }
}
