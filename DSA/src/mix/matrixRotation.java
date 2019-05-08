package matrix;

public class matrixRotation {
	
	
	static void rotate(int N,int matrix[][],int newmatrix[][])
	{
		
		for(int i=N-1;i>=0;i--)
		{
			for(int j=0;j<N;j++)
			{
				newmatrix[N-i-1][j]=matrix[j][i];
				
			}
		}
		
	}
	
	
	static void display(int N,int matrix[][])
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		int N=3;
		int matrix[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int newmatrix[][] = new int[N][N];
		System.out.println("matrix before rotation:");
		display(N, matrix);
		System.out.println("after roatation of 90 degree:");
		rotate(N, matrix,newmatrix);
		
		display(N, newmatrix);
	}

}
