package array;

import java.util.Scanner;

public class thirdLargestElement {
	public static int find(int arr[])
	{
		int l=0;
		int sl=-1;
		int tl=-1;
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[l])
			{
				tl=sl;
				sl=l;
				l=i;
			}
			else {
				if( sl==-1 || arr[i]>arr[sl] ){
				tl=sl;
				sl=i;
				
				
			}
			else 
				{if( tl==-1 || arr[i]>arr[tl] )
			{
				tl=i;
			}
				}
			}
					
				
			}
		System.out.println(l);
		System.out.println(sl);
		System.out.println(tl);
		return arr[tl];
		}
	
	
	public static void main(String[] args) {
	int arr[]=new int[5];
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
	}
	int k=find(arr);
	System.out.println(k);
}
	
}
