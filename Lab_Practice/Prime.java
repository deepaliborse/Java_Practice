class Prime
{
public static void main(String args[])
{
int num=10, i, flag=0;
int range=num/2;

if(num==0 || num==1)
{
System.out.println(num+" is not prime number!");
}
else
{
	for(i=2; i<=range; i++)
	{
	if(num%i==0)
	{
		System.out.println(num+" is not prime number!");
		flag = 1;
		break;
	}
	}
}
if(flag==0)
{
System.out.println(num+" is prime number!");
}
}
}
