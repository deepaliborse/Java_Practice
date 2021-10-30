import java.util.*;

class Account1
{
int acno;
String name;
double balance;

public Account1(int acno, String name, double balance)
{
this.acno=acno;
this.name=name;
this.balance=balance;
}

public void displayDetails()
{
System.out.println("--------\nAccount number:" + acno);
System.out.println("Account holder's name:" + name);
System.out.println("Account holder's balance:" + balance);
}

public void deposite(double amount)
{
balance+=amount;
}

public void withdraw(double amount)
{
balance-=amount;
}

public static void main(String args[])
{
Scanner sc =  new Scanner(System.in);

System.out.println("Enter account number:");
int ac = sc.nextInt();

System.out.println("Enter account holder's name:");
String name=sc.next();

System.out.println("Enter account holder's balance:");
double balance = sc.nextDouble();

Account1 a1 = new Account1(ac,name,balance);
a1.displayDetails(); 


System.out.println("\n---------\nEnter your choice:\n1.Deposite \t2.Withdraw");
int choice=sc.nextInt();

System.out.println("\nEnter amount:");
double amount = sc.nextDouble();

switch(choice)
{
case 1:
a1.deposite(amount);
break;

case 2:
a1.withdraw(amount);
break;

default:
System.out.println("Invalid Choice !!");
break;
}

a1.displayDetails();
}
}
























