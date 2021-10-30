class Ascii 
{
public static void main(String args[])
{

System.out.println("ASCII values of A-Z:\n");
for(int i=65; i<=90; i++)
{
System.out.println("ASCII of " + (char)i + " = " + i);
}

System.out.println("\n-------------\nASCII values of a-z:\n");
for(int i=97; i<=122; i++)
{
System.out.println("ASCII of " + (char)i + " = " + i);
}

System.out.println("\n-------------\nASCII values of 0-9:\n");
for(int i=48; i<=57; i++)
{
System.out.println("ASCII of " + (char)i + " = " + i);
}
}
}
