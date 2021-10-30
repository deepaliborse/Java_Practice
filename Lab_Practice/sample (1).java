import java.util.*;

class sample
{
public static void main(String args[])
{
int pcount;

Scanner sc = new Scanner(System.in);

System.out.println("Enter patient count");

pcount = sc.nextInt();


if(pcount > 500)
{
System.out.println("Post the Lockdown");
}
else
{
System.out.println("dont post the Lockdown");
}
}
}
