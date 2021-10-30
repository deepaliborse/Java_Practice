import java.util.*;

class Customer
{
int custID;
String custName;
String location;

Customer(int ID, String Name, String Loca)
{
this.custID = ID;
this.custName = Name;
this.location = Loca;
}

public void displayInfo()
{

System.out.println("\n-------------\nInside display function!\n");
System.out.println("Customer ID:" + custID);
System.out.println("Customer Name: " + custName);
System.out.println("Customer Location: " + location);
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter customer ID:");
int custID = sc.nextInt();

System.out.println("Enter customer name:");
String custName = sc.next();

System.out.println("Enter customer location:");
String location = sc.next();

Customer c1 = new Customer(20,"Deepali","Nashik");	//Constructor which takes hardcoded values
Customer c2 = new Customer(custID, custName, location); //Will take user values

c1.displayInfo();

c2.displayInfo();
}

}

















