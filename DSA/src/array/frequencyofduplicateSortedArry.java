package array;

public class frequencyofduplicateSortedArry {
/*
	public static void main(String[] args) {
		int arr[]= {4,4,4,5,2,2,7};
		int d[]=new int[arr.length];
		int f[]=new int[arr.length];
		int i=1;
		int j=0;
		d[j]=arr[0];
		f[j]=1;
		
		
		while(i<arr.length)
		{
			if(arr[i]==d[j])
			{
				i++;
				f[j]=f[j]+1;
				
			}
			else {
				
				j++;
				d[j]=arr[i];
				f[j]=1;
				i++;
				
				
				
			}
			
		}
		for(int k=0;k<d.length;k++)
		{
		System.out.print(d[k]);
		}
		System.out.println();
		for(int k=0;k<d.length;k++)
		{
		System.out.print(f[k]);
		}
		

	}*/
	public static void main(String[] args) {
	int arr[]= {4,4,4,5,2,2,7,1};
	int i=0;
	int j=i+1;
	int c=1;
	while(i<arr.length-1 && j<arr.length )
	{
		if(arr[i]==arr[j])
		{
			c=c+1;
			j++;
		}
		else {
			System.out.println(arr[i]+"freq is"+c);
			i=j;
			j=i+1;
			c=1;
		}
		}
	System.out.println(arr[i]+"freq is"+c);
	}



}
