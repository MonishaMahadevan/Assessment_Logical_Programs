import java.util.Scanner;

public class Person 
{
    String name="";
    String Country="";
    int DOB=0;
    int year=0;
    public void Person(String name,String Country,int DOB)
    {
        this.name=name;
        this.Country=Country;
        this.DOB=DOB;
    }
    public int Details(int year,int DOB)
    {
        int Age=year-DOB;
        return Age;
    }
    public static void main(String[]args)
    {
        Person Monisha=new Person();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scn.nextLine();
        System.out.println("Enter your country:");
        String Country=scn.nextLine();
        System.out.println("Enter your DOB:");
        int DOB=scn.nextInt();
        System.out.println("Enter your Current year:");
        int year=scn.nextInt();
        int Age=Monisha.Details(year,DOB);
        System.out.println("Your age is "+Age);
    }
}
