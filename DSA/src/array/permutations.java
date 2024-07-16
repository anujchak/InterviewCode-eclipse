package array;

public class permutations {
		static int f=0;
	    public static String swap(String s1,int i,int j)
	    {
	         StringBuilder sb = new StringBuilder(s1);
	        sb.setCharAt(i, s1.charAt(j));
	        sb.setCharAt(j, s1.charAt(i));
	        return sb.toString();
	    }
	    public static void per(String s1,int i,String s2)
	    {	
	        int n =s1.length();
	        if(i==n)
	        {	System.out.println(s1);
	        	int j=s2.indexOf(s1);
	        	System.out.println(j);
	        	if(j==-1)
	            {  
	                
	            }
	            else{
	                f=1;
	            }
	        }
	        for(int k=i;k<n;k++)
	        {
	            s1=swap(s1,i,k);
	            per(s1,i+1,s2);
	            s1=swap(s1,i,k);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ab";
		String s2="eidboaoo";
		 per(s1,0,s2);
		 if(f==1)
		 {
			 System.out.println("yes");
		 }
		 else {
		 System.out.println("no");
		 }
	}
	
}

