package StudentRepo;

public class Birthday {
    private int day;
    private Month month;
    private int year;

    public Birthday(){

    }
    public String toString(){
        return (day + "-" + month + "-" + year);
    }
}
