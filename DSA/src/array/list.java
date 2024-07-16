package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class list {
static class pair
{	int i;
	int j;
	 public pair(int k, int l) {
		 this.i=k;
			this.j=l;
	 }
	@Override
	public String toString() {
		return "(i=" + i + ", j=" + j + ")";
	}
}
public static void main(String[] args)
{
	List<pair>l=new ArrayList<>();
	pair s=new pair(10,20);
	l.add(s);
	l.add(new pair(3,20));
	l.add(new pair(4,20));
	System.out.println((l.get(0)).i);
	System.out.println(l);
	HashMap<Integer,List>map=new HashMap<>();
	map.put(3, l);
	(map.get(3)).add(new pair(5,20));
	System.out.println(map);
	HashSet<List<Integer>>h=new HashSet<>();
	List<Integer>l1=new ArrayList<>();
	l1.add(1);
	l1.add(2);
	l1.add(3);
	h.add(l1);
	List<Integer>l2=new ArrayList<>();
	l2.add(1);
	l2.add(3);
	l2.add(2);
	
	Collections.sort(l2);
	h.add(l2);
	System.out.println(h.size());
}
}
