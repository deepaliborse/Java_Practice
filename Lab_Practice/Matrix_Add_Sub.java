class Matrix_Add_Sub
{
public static void main(String args[])
{

int a[][] = new int[][] {{3,4,5},{5,4,3}}; 
int b[][] = new int[][] {{7,6,5},{5,6,7}}; 


System.out.println("MAtrix A");
for(int i=0; i<2; i++)
{
	for(int j=0; j<3; j++)
	{                                                                                                                               
		System.out.print(a[i][j]+ " ");
	}
	System.out.println();
}

System.out.println("MAtrix B");
for(int i=0; i<2; i++)
{
	for(int j=0; j<3; j++)
	{
		System.out.print(b[i][j]+ " ");
	}
	System.out.println();
}
                                                                                  

int c[][] = new int[2][3];
System.out.println("\nAddition of MAtrix A and B");

for(int i=0; i<2; i++)
{
	for(int j=0; j<3; j++)
	{
		c[i][j] = a[i][j] + b[i][j];
		System.out.print(c[i][j]+ " ");
	}
	System.out.println();
}


int d[][] = new int[2][3];
System.out.println("\nSubtraction of MAtrix A and B");
for(int i=0; i<2; i++)
{
	for(int j=0; j<3; j++)
	{
		d[i][j] = a[i][j] - b[i][j];
		System.out.print(d[i][j]+ " ");
	}
	System.out.println();
}
}
}


