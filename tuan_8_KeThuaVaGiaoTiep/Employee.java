public class Employee
{
    private int Hours;
    private int Salary;
    private int VacationDays;
    private String Form;

    public Employee() //khoi tao mac dinh
    {
        this( 40, 40000, 10,"yellow");
    }

    //khoi tao co gia tri 
    public Employee(int Hours, int Salary, int VacationDays, String Form)
    {
        this.Hours=Hours;
        this.Salary=Salary;
        this.VacationDays=VacationDays;
        this.Form=Form;
    }

    public int getHours() {return this.Hours;}
    public int getSalary() {return this.Salary;}
    public int getVacationDays() {return this.VacationDays;}
    public String getVacationForm() {return this.Form;}

}
