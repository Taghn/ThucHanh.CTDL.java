
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle()
    {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }

    public double getArea()
    {
        return this.width*this.height;
    }

    public double getPerimeter()
    {
        return 2*(this.width*this.height);
    }

}
