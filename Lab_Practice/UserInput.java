import java.util.*;

class UserInput
{
public static void main(String args[])
{

//int num1, num2; 
Scanner sc = new Scanner(System.in);
System.out.println("Please enter two numbers: \n");
int num1 = sc.nextInt();
int num2 = sc.nextInt();
System.out.println("Addition is: " + (num1+num2));

}
}
