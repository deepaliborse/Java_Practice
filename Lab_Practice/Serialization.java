import java.io.*;


class StudentInfo implements Serializable
{
String name;
int rid;
static String contact; 
StudentInfo(String n, int r, String c)
{
this.name=n;
this.rid=r;
this.contact=c;
}
}

class Serialization
{
public static void main(String args[])
{
try
{
StudentInfo si=new StudentInfo("Deepali", 101, "7083599562");

FileOutputStream fos = new FileOutputStream("/home/deepali/Documents/Java/Lab/myfile.txt");

ObjectOutputStream oos = new ObjectOutputStream(fos);

oos.writeObject(si);

oos.flush();

oos.close();
}
catch (Exception e)
{
System.out.println(e);
}
}
}







