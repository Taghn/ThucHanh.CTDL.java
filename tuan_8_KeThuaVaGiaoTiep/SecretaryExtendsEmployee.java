public class SecretaryExtendsEmployee extends Employee {
    // Hàm khởi tạo mặc định
    public SecretaryExtendsEmployee() 
    {
        super();
    }

    // Hàm khởi tạo có tham số
    public SecretaryExtendsEmployee(int Hours, int Salary)
    {
        super(Hours,Salary,10,"yellow");
    }
    
    // Hành vi rieng
    public void hanhvirieng()
    {
        System.out.println("Toi biet cach ghi chep.");
    }

}
