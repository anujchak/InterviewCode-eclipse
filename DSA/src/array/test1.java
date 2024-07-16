package array;

import java.util.Arrays;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		int arr[]= {2,4,1,5,7};
		//System.out.println(Arrays.stream(arr).sorted().skip(2).findFirst());
		//System.out.println("hi");
		String s="i love india";
		List<String>l=Arrays.asList(s.split(""));
		int f=1;
		String k="";
		for(String s1:l)
		{
			if(s1.equals(" "))
			{	System.out.println(s1);
				f=1;
				k=k+s1;
			}
			else {
				if(f==1)
				{   //System.out.println(s1);
					k=k+s1.toUpperCase();
					f=0;
				}
				else {
					k=k+s1;
				}
			}
		}
		System.out.println(k);

	}

}
