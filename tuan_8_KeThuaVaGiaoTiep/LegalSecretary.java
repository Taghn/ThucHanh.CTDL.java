public class LegalSecretary extends Employee {
    public LegalSecretary()
    {
        super(40,45000,10,"yellow");
    }

    public LegalSecretary(int Hours,int Salary)
    {
        super(Hours,Salary,10,"yellow");
    }

    public void hanhvirieng()
    {
        System.out.println("Biet cach nop ho so phap ly...");
    }

    public static void main(String[] args) {
        // Tạo đối tượng LegalSecretary với hàm khởi tạo mặc định
        LegalSecretary legalSecretary1 = new LegalSecretary();
        System.out.println("Legal Secretary 1:");
        System.out.println("Hours: "+ legalSecretary1.getHours());
        System.out.println("Salary: "+ legalSecretary1.getSalary());
        System.out.println("VacationDays: "+ legalSecretary1.getVacationDays());
        System.out.println("VacationForm: "+ legalSecretary1.getVacationForm());
        legalSecretary1.hanhvirieng();

        //Tạo đối tượng LegalSecretary với hàm khởi tạo có tham số
        LegalSecretary legalSecretary2 = new LegalSecretary(35, 50000);
        System.out.println("Legal Secretary 2:");
        System.out.println("Hours: " + legalSecretary2.getHours());
        System.out.println("Salary: " + legalSecretary2.getSalary());
        System.out.println("Vacation Days: " + legalSecretary2.getVacationDays());
        System.out.println("Vacation Form: " + legalSecretary2.getVacationForm());
        legalSecretary2.hanhvirieng(); // In ra "Tôi biết cách nộp hồ sơ pháp lý!"
    }
}

