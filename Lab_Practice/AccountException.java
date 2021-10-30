//Day-16


import java.util.Scanner;

class WrongAccountDetailsException extends RuntimeException    
				//so the class is of unchecked exception as customize exceptions are mostly comes under unchecked exception
{
	WrongAccountDetailsException(String msg)		 //constructor			
	{
		System.out.println("\n"+msg);          //msg passed
	}
}



class AccountException       //create class
{

public static void main(String agrs[])			//main method
	{
	System.out.println("ACCOUNT NUMBER STARTS ABOVE 14000\n");
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Account Holder name");
	String a = sc.nextLine();
	System.out.println("Enter the Account Number");
	int b = sc.nextInt();				
	
	try                        //try catch finally used  to avoid abnormally exception  
	{
		if(b<14000)  			//as we assume if account no will less than 14000 then
		{
		throw new WrongAccountDetailsException("\nPlease Provide Correct Details!!");   
						//exception object with message of incorrect  details entered 
		}
		else 
		{
		System.out.println("\n-----\nAccount holder: " +a);
		System.out.println("Account Number: " +b);
		}
	}
	catch(WrongAccountDetailsException e)
		{
			System.out.println(e);
		}
	}

}

