import java.util.Scanner;
class Circle
{
    public static double Area(double radius)
    {
        double area=3.14*radius*radius;
        return area;
    }
    public static double Perimeter(double radius)
    {
        double perimeter=2*3.14*radius;
        return perimeter;
    }
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Radius:");
        double radius=scn.nextInt();
        double area=Area(radius);
        double perimeter=Perimeter(radius);
        System.out.println("The area of circle is "+area);
        System.out.println("The perimeter of circle is "+perimeter);
        
    }
}