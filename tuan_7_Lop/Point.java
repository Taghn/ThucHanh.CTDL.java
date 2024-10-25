public class Point {
    int x;
    int y;
    public double khoangcach()
    {
        return Math.sqrt(x*x+y*y);
    }

    public void dich(int dx, int dy)
    {
        x+=dx;
        y+=dy;
    }

}
