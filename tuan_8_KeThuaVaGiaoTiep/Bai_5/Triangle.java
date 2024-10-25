

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    //ham khoi tao mac dinh
    public Triangle()
    {
        this.a=0;
        this.b=0;
        this.c=0;
    }
    //ham khoi tao tham so
    public Triangle(double a, double b, double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getArea()
    {
        double s=(this.a + this.b + this.c)/2;
        return Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
    }

    public double getPerimeter()
    {
        return this.a + this.b + this.c;
    }
}
