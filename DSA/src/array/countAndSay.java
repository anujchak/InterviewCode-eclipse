package array;

public class countAndSay {
	class Solution {
	    public String countAndSay(int n) {
	        if(n==1)return "1";
	        StringBuilder s=new StringBuilder("1");
	         
	    
	        int c=0;
	        for(int i=2;i<=n;i++)
	        {   c=1;
	            int k=1;
	             StringBuilder t=new StringBuilder();
	            for(;k<s.length();k++)
	            {
	                if(s.charAt(k)!=s.charAt(k-1))
	                {
	                    t.append(String.valueOf(c));
	                    t.append(s.charAt(k-1));
	                    c=1;
	                }
	                else{
	                    c=c+1;
	                }
	            }
	          t.append(String.valueOf(c));
	          t.append(s.charAt(k-1));
	         s=t;
	         
	            }
	        return s.toString();
	        }
	    }

}
