package practice;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		System.out.println("give five number");
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		for(int i:arr)
		{
			System.out.print(i);
		}
		System.out.println("hii");
		System.out.println("hi");
	}

}
