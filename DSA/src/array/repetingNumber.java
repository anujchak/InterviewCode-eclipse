package array;

public class repetingNumber {
	
	    // DO NOT MODIFY THE LIST. IT IS READ ONLY
	    public ArrayList<Integer> repeatedNumber(final List<Integer> l) {
	        int n= l.size();
	         long  s=(n*(n+1))/2;
	        long  p=(n*(n+1)*(2*n+1))/6;
	         long  s1=0;
	         long  p1=0;
	        for(int e:l)
	        {
	            s1=s1+( long)e;
	            p1=p1+( long)(e*e);
	        }
	        long  sd=s-s1;
	        long  pd=p-p1;
	        int x=(int)((sd+(pd/sd))/2);
	        int y=(int)(x-sd);
	        ArrayList<Integer> l1=new ArrayList<Integer>();
	        l1.add(y);
	         l1.add(x);
	        return l1;
	    }
	}


