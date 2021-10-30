class Factorial
{
public static void main(String args[])
{
int num=4, fact1=1, fact2=1, i = 1;


System.out.println("Using while loop:");
while(i <= num)
{
fact1 = i*fact1;
i++; 
}
System.out.println("Factorial of 4: " + fact1);


System.out.println("\nUsing for loop:");
for(i=1; i<=num; i++)
{
fact2 = i*fact2;
}
System.out.println("Factorial of 4: " + fact2);

}
}
