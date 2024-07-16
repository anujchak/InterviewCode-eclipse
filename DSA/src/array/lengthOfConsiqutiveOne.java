package array;

public class lengthOfConsiqutiveOne {

	public static void main(String[] args) {
		int arr[]= {1,1,1,0,0,1,0,1,1,1,1,0,1};
		int i=0;
		int c=0;
		int max=0;
		while(i<arr.length )
		{
			if(arr[i]==1)
			{
				c=c+1;
				if(max<c)
				{
					max=c;
				}
				i++;
			}
			else {
				c=0;
				i++;
			}
			}
		System.out.println(max);
		
		}
	

	}


