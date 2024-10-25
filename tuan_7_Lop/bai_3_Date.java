public class bai_3_Date {
    public static void main(String[] args) {
        Date d1 = new Date(1, 2, 2005);
        Date d2 = new Date(25, 5, 2020);

        int daysTo = d1.daysTo(d2);
        System.out.println("So ngay can dieu chinh: " + daysTo);

        boolean isLeapYear = d1.isLeapYear();

        if(isLeapYear)
        {
            System.out.println("Nam " + d1.getYear() + " la nam nhuan.");
        }
        else 
        {
            System.out.println("Nam " + d1.getYear() + " khong phai nam nhuan.");
        }

        String toDate = d1.toString();
        System.out.println(toDate);

    }
}
