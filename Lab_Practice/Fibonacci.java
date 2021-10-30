class Fibonacci
{
public static void main(String args[])
{

//Logic= Next number of series is formed by the addition of previous two numbers.

int num1=0, num2=1, num3, count=10;

for(int i = 0; i<=count; i++)
{
num3=num1+num2;
System.out.println(num3);
num1=num2;
num2=num3;
}

}
}
