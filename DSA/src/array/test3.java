package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test3 {

	public static void main(String[] args) {
		System.out.println("hi");
		String s= "new IBndiaaAb";
		System.out.println(s.replaceAll("n", "a"));
		List<String>l=Arrays.asList(s.split(""));
		
		//System.out.println(l.stream().mapToInt(e->e.length()).max().orElse(0));
		//System.out.println(l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		Map<String,Integer>h=new HashMap<String,Integer>();
		for(String i:l)
		{
			if(h.containsKey(i))
			{
				h.put(i,h.get(i)+1);
			}
			else {
				h.put(i,1);
			}
		}
		int n = 1231;
		int f=0;
		int k=0;
		while(n>0)
		{
			f= (10*f)+n%10;
			n=n/10;
			k++;
		}
		n=1231;
		System.out.println(f);
		String s1=n+"";
		StringBuffer s2= new StringBuffer(s1);
		s2.reverse();
		
		Integer n1= Integer.valueOf(s2.toString());
		System.out.println(n1);
		
		int arr[]= {1,2,3,4,9,2};
		int arr2[]= {5,6,2,3,6};
		//Set<Integer>hs=new HashSet<Integer>();
		//Arrays.stream(arr).forEach(e->hs.add(e));
		//System.out.println(Arrays.stream(arr2).boxed().filter(e->!hs.add(e)).collect(Collectors.toList()));
		//System.out.println(Arrays.stream(arr).boxed().distinct().filter(e->Arrays.stream(arr2).anyMatch(i->i==e)).collect(Collectors.toList()));
		System.out.println(Arrays.stream(arr).filter(e->e%2==0).sum());
		String j = new String("m");
		String j1 = new String("m");
		if(j.equals(j))
		{
			System.out.println("true");
		}
		
		
		
		
		
	}
}
