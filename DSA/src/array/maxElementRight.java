package array;

public class maxElementRight {

	public static void main(String[] args) {
		int arr[]= {7,5,8,9,6,8,5,7,4,6};
		int a[]=new int[arr.length];
		int max=Integer.MIN_VALUE;
		int t;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]>max)
			{	
				a[i]=max;
				max=arr[i];
				
			}
			else {
				a[i]=max;
			}
		}
		a[arr.length-1]=0;
		for(int i:a)
		{
		System.out.print(i);
		}
		
		

	}

}
