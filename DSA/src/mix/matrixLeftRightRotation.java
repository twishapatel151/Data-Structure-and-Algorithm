package matrix;

public class matrixLeftRightRotation {

	
	
	static int[][] rotation(int matrix[][],int rows,int cols,int flag)
	{
		int newmatrix[][]=new int[rows][cols];
		
		if(flag==0)
		{
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					newmatrix[i][j]=matrix[j][rows-i-1];
				}
			}
		}
		else if(flag==1)
		{
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					newmatrix[i][j]=matrix[rows-j-1][i];
				}
			}
		}
		
		
		
		
		return newmatrix;
	}
	
	
	static void print(int matrix[][],int rows,int cols)
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int rows=3;
		int cols=3;
		int flag=0;
		int matrix[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}		
		};
		
		System.out.println("before rotation:");
		print(matrix, rows, cols);
		int newmatrix[][]=rotation(matrix, rows, cols, flag);
		System.out.println("after rotation:");
		print(newmatrix, rows, cols);
		
	}
}
