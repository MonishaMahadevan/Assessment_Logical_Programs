import java.util.Scanner;
public class Calculator 
{
    public int Add(int num1,int num2)
    {
        int sum=num1+num2;
        return sum;
    }
    public int Sub(int num1,int num2)
    {
        int minus=num1-num2;
        return minus;
    }
    public  int Mul(int num1,int num2)
    {
        int product=num1*num2;
        return product;
    }
    public int Div(int num1,int num2)
    {
        int divide=num1/num2;
        return divide;
    }
    public static void main(String[]args)
    {
        Calculator o1=new Calculator();
        Scanner scn=new Scanner(System.in);
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Enter the Number:");
        int press=scn.nextInt();
        if (press==1)
        {
            System.out.println("Enter the Number 1:");
            System.out.println("Enter the Number 2:");
            int num1=scn.nextInt();
            int num2=scn.nextInt();
            System.out.println("The addition of two numbers is "+o1.Add(num1,num2) );
        }
        else if (press==2)
        {
            System.out.println("Enter the Number 1:");
            System.out.println("Enter the Number 2:");
            int num1=scn.nextInt();
            int num2=scn.nextInt();
            System.out.println("The Substraction of two numbers is "+o1.Sub(num1,num2) );
        }
        else if (press==3)
        {
            System.out.println("Enter the Number 1:");
            System.out.println("Enter the Number 2:");
            int num1=scn.nextInt();
            int num2=scn.nextInt();
            System.out.println("The Multiplication of two numbers is "+o1.Mul(num1,num2) );
        }
        else if (press==4)
        {
            System.out.println("Enter the Number 1:");
            System.out.println("Enter the Number 2:");
            int num1=scn.nextInt();
            int num2=scn.nextInt();
            System.out.println("The Division of two numbers is "+o1.Div(num1,num2) );
        }
    }
}
