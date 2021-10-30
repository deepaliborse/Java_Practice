import java.util.*;

class Swap_without_temp
{
public static void main(String args[])
{
int a,b;

Scanner sc = new Scanner(System.in);

System.out.println("Enter value of a:");
a = sc.nextInt();

System.out.println("Enter value of b:");
b = sc.nextInt();

System.out.println("\n-----\na and b after swapping:");

a = a + b;
b = a - b;
a = a - b;

System.out.println("a = " + a);
System.out.println("b = " + b);
}
}
