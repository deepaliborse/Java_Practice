import java.util.*;

class Account1
{
int acno;
String name;
double balance;

public void setAcno(int acno)
{
this.acno=acno;
}

public void setName(String Name)
{
this.name=name;
}

public int getAcno()
{
return acno;
}

public String getName()
{
return name;
}

public Account1(int acno, String name, double balance)
{
this.acno=acno;
this.name=name;
this.balance=balance;
}

public void displayDetails()
{
System.out.println("--------\nAccount Details:\n");
System.out.println("Account number:" + acno);
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
}



class Account_Getter_Setter
{
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


System.out.println("\n--------\nInside get method for Account number:" + a1.getAcno());

System.out.println("Inside get method for Account holder's name:" + a1.getName());
}
}
























