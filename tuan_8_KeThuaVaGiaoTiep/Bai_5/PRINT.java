
public class PRINT {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0]=new Rectangle(18,18);
        shapes[1]=new Triangle(30,30,30);
        shapes[2]=new Circle(12);

        double RectangleArea=shapes[0].getArea();
        double RectanglePerimeter=shapes[0].getPerimeter();

        double TriangleArea=shapes[1].getArea();
        double TrianglePerimeter=shapes[1].getPerimeter();

        double CircleArea=shapes[2].getArea();
        double CirclePerimeter=shapes[2].getPerimeter();

        System.out.println("Rec's Area: "+RectangleArea);
        System.out.println("Rec's Perimeter: "+RectanglePerimeter);

        System.out.println("Tri's Area: "+ TriangleArea);
        System.out.println("Tri's Perimeter: "+ TrianglePerimeter);

        System.out.println("Cir's Area: "+CircleArea);
        System.out.println("Cir's Perimeter: "+CirclePerimeter);
    }
}
