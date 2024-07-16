package array;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class important_interview_ques {
public static void main(String[] args) {

	
		
		List<String>l=Arrays.asList("anuj".split(""));
		List<Integer>l1=List.of(1,2,3);
		List l2=List.of(1,"an",1.5,"f",6,'c',9,4);
				
		System.out.println();
		
		//System.out.println(fun('a',"anuj").getClass());
		//System.out.println(fun1(l1).get(0).getClass());
		//fun2(l2);
		//System.out.println(fun3());
		keysort();
		
	
	
	
}
	
public static <T,V> T fun(T a,V b) {
	System.out.println(a.getClass());
	System.out.println(b.getClass());
	return a;
}
public static List<?> fun1(List<?>l)
{
	return l;
}
public static void fun2(List l)
{
	List<Integer>l1=(List<Integer>) l.stream().filter(e->e instanceof Integer).collect(Collectors.toList());
	System.out.println(l1.stream().mapToInt(e->e).sum());
	
}
public static int fun3()
{
	try {
		System.out.println("in try");
	     int a=5;
	     int b= a/0;
		
	}
	
	
	catch(Exception e) {
		System.out.println("in catch");
		return 1;
	}
	catch(ArithmeticException e1){
	}

	
	finally {
		
		System.out.println("in finally");
		return 3;
	}
}

public static void keysort()
{	
	String s="abcddcdaabae";
	List<String>l=Arrays.asList(s.split(""));
	//Map<String,Integer>m=(Map<String,Integer>)l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	Map<String,Integer>m = new HashMap<String,Integer>();
	for(String k:l)
	{
		if(m.containsKey(k))m.put(k,m.get(k)+1);
		else {
			m.put(k,1);
		}
	}
	Set<Map.Entry<String,Integer>>s1=m.entrySet();
	List<Map.Entry<String,Integer>>l1=new ArrayList<Map.Entry<String,Integer>>(s1);
	Collections.sort(l1,(o1,o2)->o2.getValue()-o1.getValue());
	for(Map.Entry<String,Integer> j:l1)
	{
		System.out.println(j.getKey()+"="+j.getValue());
	}
	
	

}
}
