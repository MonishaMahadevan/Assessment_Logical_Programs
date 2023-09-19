import java.util.Scanner;
public class Bank 
{
    String username;
    String password;
    double balance;
    public  Bank(String username,String password,double initialBalance)
    {
        this.username = username;
        this.password = password;
        this.balance = initialBalance;
    }
    public String Login(String oldusername,String oldpassword)
    {
        if (this.username.equals(oldusername) && this.password.equals(oldpassword))
        {
            return "Login Successful!";
        } 
        else
        {
            return "Invalid credentials";
        }
    }
    public String PasswordChange(String oldpassword,String newPassword)
    {
        if (oldpassword.equals(this.password))
        {

            password=newPassword;
            return password;
        }
        else
        {
            return "Enter a correct password";
        }
    }
    public double Credit(int money)
    {
        balance=balance+money;
        return balance;
    }
    public double Debit(int money)
    {
        balance=balance-money;
        return balance;
    }
    public static void main(String[]args)
    {
        Bank SBI=new Bank("Monisha","1234",2000);
        Scanner scn=new Scanner(System.in);
        System.out.println("Press 1 for Login");
        System.out.println("Press 2 for PasswordChange");
        System.out.println("Press 3 for Crediting money");
        System.out.println("Press 4 for Debiting money");
        System.out.println("Enter the Number:");
        int press=scn.nextInt();
        if (press==1)
        {
            System.out.println("Enter the Username:");
            String oldusername=scn.next();
            System.out.println("Enter the Password:");
            String oldpassword=scn.next();
            System.out.println(SBI.Login(oldusername,oldpassword));
            
        }
        else if (press==2)
        {
            System.out.println("Enter the old password:");
            String oldpassword=scn.next();
            System.out.println("Enter the new password:");
            String newPassword=scn.next();
            System.out.println("Your new password is "+SBI.PasswordChange(oldpassword,newPassword));
        }
        else if (press==3)
        {
            System.out.println("Enter the Amount to be added:");
            int money=scn.nextInt();
            System.out.println(SBI.Credit(money));
        }
        else if (press==4)
        {
            System.out.println("Enter the Amount to be debited:");
            int money=scn.nextInt();
            System.out.println("Your current balance is "+SBI.Debit(money));
        }
    }
}
