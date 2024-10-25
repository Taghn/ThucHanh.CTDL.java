public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year)
    {
        this.day= day;
        this.month=month;
        this.year=year;
    }

    public void addDays()
    {
        this.day+=day;
    }

    public void addWeeks()
    {
        this.month+=month;
    }

    public int daysTo(Date Other)
    {
        int OtherDay=Other.getDay();
        return Math.abs(day-OtherDay);
    }

    public int getDay()
    {
        return this.day;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getYear()
    {
        return this.year;
    }

    public boolean isLeapYear() // Xảy ra mỗi 4 năm, trừ bội số 100 không phải bội số 400. (idk)
    {
        return(year % 4 ==0 && year % 100 != 0 || year % 400 ==0);
    }

    public String toString()
    {
        return this.year + "/" + this.month + "/" + this.day;
    }

}
