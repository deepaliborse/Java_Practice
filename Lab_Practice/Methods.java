class Methods
{
int sid;
String sname;
int sage;


void input(int id, String name, int age)
{
sid = id;
sname=name;
sage=age;

System.out.println("This in input method!");
}

void display()
{

System.out.println("Student ID: "+ sid);
System.out.println("Student name: "+ sname);
System.out.println("Student age: "+ sage);

System.out.println("This is inside display method!");
}

public static void main(String args[])
{
Methods s1 = new Methods();
s1.input(101,"Deepali",24);
s1.display();
}

}









