import java.util.*;

class bank
{
private int ac_no;
private String name;
private double balance;

public void Account(int acno, String name, double bal)
{
this.ac_no = acno;
this.name = name;
this.balance = bal;
}

public void Display()
{
//System.out.println("\nInside Display method:");

System.out.println("Account number: " + ac_no);

System.out.println("Account holder's Name:" + name);

System.out.println("Total balance: " + balance);
}

public void Deposite(double amt)
{
balance += amt;
}

public void Withdraw(double amt)
{
balance -= amt;
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

Scanner sc_str = new Scanner(System.in);

System.out.println("Enter Account number:");
int ac_no = sc.nextInt();

System.out.println("Enter Account holder's name:");
String name = sc_str.nextLine();

System.out.println("Enter Balance amount:");
double balance = sc.nextDouble();


bank b1 = new bank();
//b1.Account(1,"Deepali",500);


System.out.println("\n ----- Account holder's information -----");
b1.Display();


System.out.println("\n\nEnter your choice:\n1. Deposite \t2. Withdraw");
int choice = sc.nextInt();

System.out.println("Enter amount:");
double amt = sc.nextDouble();

if(choice == 1)
{
b1.Deposite(amt);
}
else if(choice == 2)
{
b1.Withdraw(amt);
}
else
{
System.out.println("Invalid choice!");
}


System.out.println("\n ----- Account holder's information -----");
b1.Display();
}

}





























