class Methods_Calculator
{
public static void main(String args[])
{
System.out.println("Pass by reference method:");
int i = 10, j = 20;

int result1 = Addition(i,j);
System.out.println("Addition : " + result1);
System.out.println("Subtraction : " + Subtraction(i,j));
System.out.println("Multiplication : " + Multiplication(i,j));
System.out.println("Division : " + Division(i,j));


System.out.println("\n---------\nPass by value method:");
System.out.println("Addition : " + Addition(10,20));
System.out.println("Subtraction : " + Subtraction(10,20));
System.out.println("Multiplication : " + Multiplication(10,20));
System.out.println("Division : " + Division(10,20));
}


static int Addition(int a, int b)
{
int result;
result = a + b;
return result;
}

static int Subtraction(int a, int b)
{
int result;
result = a - b;
return result;
}

static int Multiplication(int a, int b)
{
int result;
result = a * b;
return result;
}

static int Division(int a, int b)
{
int result;
result = a / b;
return result;
}
}
