import java.util.*;


class Marks
{
public static void main(String args[])
{
int marks[] = new int[5];    //Alocating memory to array having 5 elements and integer datatype

int i, total=0;
float avg = 0.0f;

Scanner sc = new Scanner(System.in);

for(i=0; i<5; i++)
{
	System.out.println("Enter marks of subject " + (i+1) + ":");
	marks[i]=sc.nextInt();
	total = total + marks[i];
}

if(avg/5 <= 40)
{
	System.out.println("\nPass!\n");
}
else
{
	System.out.println("\nFail!\n");
}
}
}


























