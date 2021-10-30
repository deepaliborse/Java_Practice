import java.util.*;


class SwitchCalculator
{
public static void main(String args[])
{

int x=13, y=2;

System.out.println(" Welcome! \n\n What would you like to do? : \n\nAddition --> 1 \nSubtraction --> 2  \nMultiplication --> 3 \nDivision --> 4");

Scanner sc = new Scanner(System.in);

System.out.println("\nEnter Your Choice:");
int choice = sc.nextInt();



switch(choice)
{

case 4 :
System.out.println("Division is: " + (x/y));
break;

case 1 :
System.out.println("Addition is: " + (x+y));
break;

case 2 :
System.out.println("Subtraction is: " + (x-y));
break;

case 3 :
System.out.println("Multiplication is: " + (x*y));
break;


default:
System.out.println("Invalid Choice! \nOutside Switch case!");
break;
}


}
}
