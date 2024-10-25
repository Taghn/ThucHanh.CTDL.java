public class Point2 {
    int x;
    int y;
    
    public Point2()
    {
        x=0;
        y=0;  //khoi tao rong
    }
    
    public Point2(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public double khoangcach()
    {
        return Math.sqrt(x*x+y*y);
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public void setLocation(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public String ToString()
    {
        return "(" + x + "," + y + ")";
    }

    public void dich(int x, int y)
    {
        this.x+=x;
        this.y+=y;
    }
}
