package array;

import java.util.Scanner;

public class part1 {
	//deleting key element from an array
	public static int del(int arr[],int key)
	{	int n=arr.length;
		int i =0;
		for(;i<n;i++)
		{	
			if(arr[i]==key)
			{
				break;
			}
			
		}
		if(i==n)return n;
		for(int j=i;j<n-1;j++)
		{
			arr[j]=arr[j+1];
		}
		return n-1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key = sc.nextInt();
		int size=del(arr,key);
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]);
		}
		
		

	}

}
