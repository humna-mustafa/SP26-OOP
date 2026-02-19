public class RectangleTest {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
       Rectangle r2 = new Rectangle();
        System.out.println(r2);

        r1.length=10.0;
        r1.width=5.0;
        r2.length=7.0;
        r2.width=3.0;
        
System.out.println(r1.length);
System.out.println(r1.width);
System.out.println(r2.length);
System.out.println(r2.width);

double area=r1.calArea();
System.out.println("Area of Rectangle"+" "+r1+" "+area);

double perimeter=r1.calPerimeter();
System.out.println("Area of Perimeter"+" "+r1+" "+perimeter);
    }


}