

public class bai_2_Class {
    public static void main(String[] args) {
        Point2 p= new Point2(5,6);
        
        System.out.println("Gia tri cho truoc khi dich chuyen: ");

        p.dich(1, 5);

        System.out.println("Gia tri sau khi dich chuyen x: "+ p.ToString());
        System.out.println("Khoang cach den goc toa do: "+ p.khoangcach());

    }
}
