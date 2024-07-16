package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		List<Integer> l =new ArrayList<>();
		List<String> l3 =new ArrayList<>();
		List<Integer> l2 =new ArrayList<>();
		System.out.println("give input");
		Scanner sc = new Scanner(System.in);
		//String s=sc.nextLine();
		 l3 = Arrays.asList((sc.nextLine().split(" ")));
		/*int n;
		for(String k:l1)
		{	n=Integer.parseInt(k);
			l.add(n);
			System.out.println(++n);
		}*/
		System.out.println(l3);
		//l2=l3.subList(1,3);
		//System.out.println(l2);

	}

}
