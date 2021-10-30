import java.util.Scanner;   //importing package

class AccountAb     //creating class
{
	int accno;
	String accholder;    //declaring instance variable
	int balance;
	
    public AccountAb(int accno, String accholder, int balance )  //contructor
    {
	   this.accno=accno;          //this keyword for refering the current class object
	   this.accholder=accholder;
	   this.balance=balance;
    }

    void displayAcc()    //method
    {
	System.out.println("The account number is =" +accno);             
	System.out.println("The account holder name is=" +accholder);
	System.out.println("The account Balance is=" +balance);
    }
}




class Savingaccount extends AccountAb     //getting subclass
{
	int nooftrans;      //declaring instance variable
	int interestrate;


	public Savingaccount(int nooftrans, int interestrate,int accno, String accholder, int balance)    
						//constructor with parameterr of parent class i.e.using constructor chaining
    	{ 
   	super(accno,accholder,balance);    //super keyword for referred the object of parent class i.e.AccountAb
	this.nooftrans=nooftrans;           //this keyword for refering the current class object
	this.interestrate=interestrate;
   	}

	void displaysub()      //display method
    	{
		System.out.println("The Number of transactions are=" +nooftrans);
    		System.out.println("The Rate of interest is=" +interestrate);
    	}
}



class Currentaccount extends AccountAb        //getting subclasss
{
    int overdraft;                               //declaring instance variable

    public Currentaccount (int overdraft,int accno, String accholder, int balance )        //constructor chaining
    {
	super(accno,accholder,balance);         //super keyword for referred the object of parent class i.e.AccountAb
	this.overdraft=overdraft;             //this keyword for refering the current class object
    }

    void displaycurr()            //diaplay method
    {
	System.out.println("The Amount of overdraft is=" +overdraft);     
    }
}



class Demataccount extends AccountAb           //getting subclass
{
	int tradeno;                                 //declaring instance variable

	public Demataccount (int tradeno,int accno, String accholder, int balance )               //constructor chaining
	{
  		super(accno,accholder,balance);             //super keyword for referred the object of parent class i.e.AccountAb
		this.tradeno=tradeno;                       //this keyword for refering the current class object
  	}
	
	void displaydem()                                 //method
  	{
		System.out.println("The Trade no is=" +tradeno);
 	}
}



class Day11
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);                           //getting user input

	System.out.println("Enter the account number");
	
	int a =sc.nextInt();
	sc.nextLine();
  
	System.out.println("Enter the account Holder name");
	String b =sc.nextLine();

	System.out.println("Enter the account Balance");
	int c =sc.nextInt();

	System.out.println("Enter the No of transactions in saving account");
	int d=sc.nextInt();

	System.out.println("Enter the Rate of interest in saving account");
	int e =sc.nextInt();

	System.out.println("The Amount of overdraft is");
	int f =sc.nextInt();

	System.out.println("Enter the trade no for Demat account");
	int g =sc.nextInt();

	AccountAb obj1= new AccountAb(a,b,c);             //obj for callig mathod1
	obj1.displayAcc();

	Savingaccount obj2= new Savingaccount(d,e,a,b,c);        //obj for callig mathod2
 	obj2.displaysub();
 
	Currentaccount obj3= new Currentaccount(f,a,b,c);       //obj for callig mathod3
 	obj3.displaycurr();
 
	Demataccount obj4= new Demataccount(g,a,b,c);       //obj for callig mathod4    
 	obj4.displaydem();

     }
}



