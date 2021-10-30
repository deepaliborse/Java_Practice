class DescendingArray
{
public static void main(String args[])
{
int a[] = new int[] {22,55,11,33,44};

//int temp=0;
int i=0,j=0;

System.out.println("Elements of original array: ");
for (i = 0; i < a.length; i++)
{	 
        System.out.print(a[i] + " ");    
}  

for(i=0; i<a.length; i++)
{
	for(j=i+1; j<a.length; j++)
	{
		if(a[i]<a[j])
		{					// Let i = 10, j=20
			a[i]=a[i]+a[j];			// 30 = 10+20
			a[j]=a[i]-a[j];			// 20 = 30-10
			a[i]=a[i]-a[j];			// 10 = 20-10
		}
	}
}

System.out.println("\n-----\nArray after sorting in Descending order:");
for(i=0; i<a.length; i++)
{
	System.out.print(a[i]+ " ");
}
System.out.print("\n");
}

}



  
           
