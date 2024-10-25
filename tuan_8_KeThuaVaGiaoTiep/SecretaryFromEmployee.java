public class SecretaryFromEmployee {
    private int Hours;
    private int Salary;
    private int VacationDays;
    private String Form;


    //khoi tao co gia tri 
    public SecretaryFromEmployee(int Hours, int Salary, int VacationDays, String Form)
    {
        this.Hours=Hours;
        this.Salary=Salary;
        this.VacationDays=VacationDays;
        this.Form=Form;
    }


    public SecretaryFromEmployee() //khoi tao mac dinh
    {
        this( 40, 40000, 10,"yellow");
    }

    
    public int getHours() {return this.Hours;}
    public int getSalary() {return this.Salary;}
    public int getVacationDays() {return this.VacationDays;}
    public String getVacationForm() {return this.Form;}

    public void hanhvirieng()
    {
        System.out.println("Toi biet cach ghi chep.");
    }
}

