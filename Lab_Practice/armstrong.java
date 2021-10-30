import java.util.*;
import java.lang.Math;


class armstrong
{
public static void main(String args[])
{
int num, digit, sum = 0, temp;

Scanner sc = new Scanner(System.in);

System.out.println("Please enter any number: ");

num = sc.nextInt();

temp = num;

while(num>0)
{
digit = num % 10;
sum += (Math.pow(digit,3));
num = num/10;
}

if(temp==sum)
{
System.out.println("Armstrong number!");
}
else
{
System.out.println("Not an Armstrong number!");
}
}
}






















