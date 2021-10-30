class Matrix_Multiplication
{
public static void main(String args[])
{
int a[][] = new int[][] {{3,4,5},{5,4,3}}; 
int b[][] = new int[][] {{7,6},{5,5},{6,7}}; 


System.out.println("Matrix A");
for(int i=0; i<2; i++)
{
	for(int j=0; j<3; j++)
	{                                                                                                                               
		System.out.print(a[i][j]+ " ");
	}
	System.out.println();
}

System.out.println("Matrix B");
for(int i=0; i<3; i++)
{
	for(int j=0; j<2; j++)
	{
		System.out.print(b[i][j]+ " ");
	}
	System.out.println();
}
                                                                                  

int c[][] = new int[3][3];
System.out.println("\nMultiplication of Matrix A and B");

for(int i=0; i<2; i++)  		//Rows of Matrix A
{
	for(int j=0; j<2; j++)   	//Columns of Matrix B 
	{
		for(int k=0; k<3; k++)	//Columns of Matrix A
		{
			c[i][j]=a[i][k]*b[k][j];
		}
		System.out.print(c[i][j]+ " ");
	}
	System.out.println();
}


}

}











