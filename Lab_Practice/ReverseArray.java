class ReverseArray
{
public static void main(String args[])
{
int i=0, j=0;
//int a[] = new int[5];
int a[] = {10,20,30,40,50};

int b[] = new int[5];

	System.out.println("Reversed array: ");

	for(i=a.length-1, j=0; i>=0 && j<a.length; i--, j++)
	{
		b[j]=a[i];
		System.out.println(b[j]);
	}
}
}

