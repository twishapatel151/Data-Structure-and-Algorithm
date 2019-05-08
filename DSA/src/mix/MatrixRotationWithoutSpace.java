package matrix;

public class MatrixRotationWithoutSpace {
	
	
	static void rotate(int N,int matrix[][])
	{
		for(int i=0;i<N/2;i++)
		{
			for(int j=i;j<N-i-1;j++)
			{
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][N-1-i];
				matrix[j][N-i-1]=matrix[N-1-i][N-1-j];
				matrix[N-1-i][N-1-j]=matrix[N-1-j][i];
				matrix[N-j-1][i]=temp;
				
			}
		}
		
	}
	
	static void  display(int N,int matrix[][])
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
	int N=4; 
	int matrix[][]= {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
	};
	
	System.out.println("before rotation:");
	display(N, matrix);
	rotate(N, matrix);
	System.out.println("after rotation:");
	display(N, matrix);
	}

}
