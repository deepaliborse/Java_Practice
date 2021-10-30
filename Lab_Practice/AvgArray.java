class AvgArray
{

public static void main(String args[])
{

int a[] = new int[5];

a[0] = 50;
a[1] = 10;
a[2] = 20;
a[3] = 30;
a[4] = 40;


int total=0;
float avg = 0.0f;

for(int i=0; i<a.length; i++)
{
	total = total + a[i];
	System.out.println("Element " + (i+1) + " : " +a[i]);
}

avg=total/a.length;
System.out.println("Average of elements of array: " + avg);

}
}
