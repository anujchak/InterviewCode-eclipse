package array;

public class emni1 {

	public static Boolean isSafe(int n,int row,int c,int a[][])
	{	
		for(int i=0;i<=row;i++)
		{
			if(a[i][c]==1)
			{
				return false;
			}
		}
		int j=c;
		for(int i=row;i>=0 && j<n;i--,j++)
		{	
			if(a[i][j]==1)
			{
				return false;
			}
		}
		j=c;
		for(int i=row;i>=0 && j>=0;i--,j--)
		{
			if(a[i][j]==1)
			{
				return false;
			}
		}
		return true;
	}

	static int c=0;
	public static void show(int a[][])
	{
		for(int k[]:a)
		{
			for(int e:k)
			{
				System.out.print(e);
			}
			System.out.println();
		}
		System.out.println("------------------");
	}
	public static void qeen(int n,int a[][],int row,int col)
	{
		if(n==row)
		{
			c++;
			show(a);
		}
		for(int c=0;c<n;c++)
		{
			if(isSafe(n,row,c,a))
			{
				a[row][c]=1;
				qeen(n,a,row+1,c);
				a[row][c]=0;
			}
		}
		
		
	}
	public static void main(String[] args) {
		int n=1;
		int a[][]=new int[n][n];
		int row=0;
		int col=0;
		qeen(n,a,row,col);
		System.out.println(c);

	}

}
