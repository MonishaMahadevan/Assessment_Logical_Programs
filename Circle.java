import java.util.Scanner;
class Circle
{
    public double Area(double radius)
    {
        double area=3.14*radius*radius;
        return area;
    }
    public double Perimeter(double radius)
    {
        double perimeter=2*3.14*radius;
        return perimeter;
    }
    public static void main(String[]args)
    {
        Circle a1=new Circle();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Radius:");
        double radius=scn.nextInt();
        double area=a1.Area(radius);
        double perimeter=a1.Perimeter(radius);
        System.out.println("The area of circle is "+area);
        System.out.println("The perimeter of circle is "+perimeter);
        
    }
}