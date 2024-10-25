public class Lawer extends Employee{
    public Lawer() //ham khoi tao mac dinh 
    {
        super(40,40000,15,"pink");
    }

    public Lawer(int Hours, int Salary) //ham khoi tao tham so 
    {
        super(Hours,Salary,15,"pink");
    }

    public void hanhvirieng()
    {
        System.out.println("Toi biet xu ly cac vu kien...");
    }
}
