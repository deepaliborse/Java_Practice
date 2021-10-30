import java.util.Scanner;   //importing package

class Customer      //declaring class
{
	String cname;    //instance variables
	int cid;

public Customer(String cname, int cid)
	{

	this.cname=cname;
	this.cid=cid;
	}
	void displayA()
	{

	System.out.println("\n----------\nThe Customer name is: " +cname);
	System.out.println("The Customer id: " +cid);
	}
}
class RetailCustomer extends Customer
{
	int credit;
	public RetailCustomer(int credit, String cname, int cid)
	{
		super(cname,cid);
		this.credit=credit;
	}
	void displayB()
	{
	System.out.println("The credit card number of retail customer is: " +credit);
	}
}
class WholesaleCustomer extends Customer
{
	int accno;
	public WholesaleCustomer(int accno, String cname, int cid)
	{
	super(cname,cid);
	this.accno=accno;
	}
	void displayC()

	{
	System.out.println("The Account number of Wholesale Customer is" +accno);
	}
}
class Day10
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Customer name");
String a=sc.nextLine();
System.out.println("Enter the Customer ID");
int b=sc.nextInt();
System.out.println("Enter the The Credit Card Number of retailcustomer");
int c=sc.nextInt();
System.out.println("Enete the account number of wholesale customer");
int d=sc.nextInt();

Customer obj1=new Customer(a,b);
obj1.displayA();
RetailCustomer obj2=new RetailCustomer(c,a,b);
obj2.displayB();
WholesaleCustomer obj3=new WholesaleCustomer(d,a,b);
obj3.displayC();
}
}
