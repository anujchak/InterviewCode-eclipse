package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class leet {

	    static class pair{
		int i;
		int j;
		 @Override
		public String toString() {
			return "pair (i=" + i + ", j=" + j + ")";
		}
		public pair(int k, int l) {
			 this.i=k;
				this.j=l;
		 }
	 }
	    public static List<List<Integer>> fourSum(int[] n, int target) {
	    	List<List<Integer>>l1=new ArrayList<>();
	    HashMap<Integer,List>map=new HashMap<>();
	    int sum=0;
	    int com=0;
	    for(int i=0;i<n.length-1;i++)
	    {   
	        for(int j=i+1;j<n.length;j++)
	        {
	            sum=n[i]+n[j];
	            if(map.containsKey(sum))
	            {
	                (map.get(sum)).add(new pair(i,j));
	            }
	            else{
	                List<pair>l=new ArrayList<>();
	                l.add(new pair(i,j));
	                map.put(sum,l);
	                }
	        }
	    }
	    System.out.println(map.get(5));
	     for(int i=0;i<n.length-1;i++)
	    {   
	        for(int j=i+1;j<n.length;j++)
	        {
	             sum=n[i]+n[j];
	            com=target-sum;
	            if(map.containsKey(com))
	            {
	                 List<pair>l=map.get(com);
	                 for(pair e:l)
	                 {
	                     if(e.i!=i && e.i!=j && e.j!=i && e.j!=j)
	                     {
	                          List<Integer>l2=new ArrayList<>();
	                         l2.add(i);
	                          l2.add(j);
	                          l2.add(e.i);
	                          l2.add(e.j);
	                          
	                         l1.add(l2);
	                     }
	                 }
	            }
	        }
	    }
	    return l1;
	    }
	public static void main(String[] args) {
		int a[]= {1,2,3,4,0};
		System.out.println(fourSum(a,10));
		System.out.println("j");
	}

}
