package array;

public class test11 {

	public static void main(String[] args) {
		//arr = [1,2,4,3,2]
		//1-->2-->4-->2-->4  arr[4]=2 arr[arr[4]]=4
		          
		
		int arr[]= {1,2,3,4,
				5,4};
		System.out.println(fun(arr));

	}
	
	public static int fun(int arr1[])
	{   
		int i=0;
		int c=0;
		while(i!=arr1[arr1[i]])
		{
			i=arr1[i];
			c=c+1;
		}
		return c+1;
	}
	
	

}
