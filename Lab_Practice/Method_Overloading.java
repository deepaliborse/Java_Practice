class Method_Overloading
{
public static void main(String args[])
{
int a=10,b=20,c=30;
fun1(a);
fun2(a,b);
fun3(a,b,c);
}

static void fun1(int var1)
{
System.out.println("Inside function 1");
var1+=10;
System.out.println(var1);
}

static void fun2(int var1, int var2)
{
System.out.println("Inside function 2");
var1=var1+var2;
System.out.println(var1);
}

static void fun3(int var1, int var2, int var3)
{
System.out.println("Inside function 3");
var1=var1+var2-var3;
System.out.println(var1);
}

}
