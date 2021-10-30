class ReverseArrayByMethod
{

public static void main(String args[])
{
int a[] = {11,22,33,44,55};

System.out.println("Original Array:");

for(int k=0; k<a.length;k++)
	{
		System.out.println(a[k]);
	}

System.out.println("Revered Array:");

reverseArray(a, a.length);
}

static void reverseArray(int a[], int size)
{
int b[] = new int[size];    	// Step1: allocating memory to b as same size of original array. 

int j = size;			// j is number of element/size of array b.

	for(int i=0; i<size; i++)
	{
		b[j-1]=a[i];	//b[j-1] last element of b[]
		j--;
	}

	for(int k=0; k<size;k++)
	{
		System.out.println(b[k]);
	}

}


}
