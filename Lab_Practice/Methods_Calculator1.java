class Methods_Calculator1

{
public static void main(String args[])
{
int a=100,b=200;
int res=add(a,b);  //pass by reference

res=add(34,67); //pass by value

int ressub=sub(a,b);
int resmul=mul(a,b);

System.out.println("Addition"+res);
System.out.println("Subtraction"+ressub);
System.out.println("Multiplication"+resmul);

int c=1000,d=2000;
int res1=add(c,d);
System.out.println(res1);

}

static int add (int num1,int num2) //num1=a(100), num2=b(200)
{
int temp;
temp=num1+num2;
return temp;
}
static int sub (int num1,int num2) //num1=a(100), num2=b(200)
{
int temp;
temp=num1-num2;
return temp;
}
static int mul (int num1,int num2) //num1=a(100), num2=b(200)
{
int temp;
temp=num1*num2;
return temp;
}

}
