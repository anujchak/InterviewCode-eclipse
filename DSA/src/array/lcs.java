package array;

import java.util.ArrayList;
import java.util.List;

public class lcs {

	public static void main(String[] args) {
		//System.out.println(all_longest_common_subsequences("cfb","aceba"));
		int a[]= {3,9,4,7};
		System.out.println(minimumDifference(a));

	}
	 public static List<String> all_longest_common_subsequences(String s, String t)
	    {   List<String> l = new ArrayList<String>();
	        int n= s.length();
	        int m= t.length();
	        int ans=0;
	        int a[][]=new int [n+1][m+1];
	        for(int i=0;i<n+1;i++)
	        {
	            for(int j=0;j<m+1;j++)
	            {
	                if(i==0 || j==0)
	                {
	                    a[i][j]=0;
	                }
	            }
	        }
	        
	         for(int i=1;i<n+1;i++)
	        {
	            for(int j=1;j<m+1;j++)
	            {   //System.out.println("in 2nd loop");
	                if(s.charAt(i-1)==t.charAt(j-1))
	                {
	                    a[i][j]=1+a[i-1][j-1];
	                }
	                else{
	                    a[i][j]=Math.max(a[i-1][j],a[i][j-1]);
	                }
	            }
	        }
	        ans=a[n][m];
	        l.add(fun(a,n,m,s,t));
	        for(int k=1;k<n+1;k++)
	        {
	            for(int h=1;h<m+1;h++)
	            {   //System.out.println("i"+k+"j"+h+"a[]"+a[k][h]);
	            //System.out.println("in 2nd loop");
	                if(a[k][h]==ans)
	                {   //System.out.println("i"+i+"j"+j);
	                    //l.add(fun(a,k,h,s,t));
	                }
	            }
	        }
	        //System.out.println(a[n][m]);
	        return l;
	        
	        
	    }
	    
	    public static String fun(int a[][],int i, int j,String s1,String s2)
	    {
	        String res="";
	        System.out.println("in while hi"+i);
	        while(i>0 && j>0)
	        {	System.out.println("in while hi");
	            if(s1.charAt(i-1)==s2.charAt(j-1))
	            {   System.out.println("hi");
	                res=res+s1.charAt(i-1);
	                i--;
	                j--;
	            }
	            else{
	                if(a[i-1][j]>a[i][j-1])
	                {	System.out.println(" in if hi");
	                    i--;
	                }
	                else{
	                	System.out.println(" in else hi");
	                    j--;
	                }
	            }
	        }
	        StringBuffer s3 = new StringBuffer(res);
	        s3.reverse();
	        return s3.toString();
	    }
	    
	    //minimum subset sum diffrence
	    
	    public static int minimumDifference(int[] a) {
	        int n = a.length;
	        int sum=0;
	        int sum1=0;
	        for(int i=0;i<n;i++)
	        {
	            sum1=sum1+a[i];
	        }
	        System.out.println(sum1);
	        sum=sum1/2;
	        System.out.println(sum);

	        boolean [][]t= new boolean [n+1][Math.abs(sum+1)];
	        for(int i=0;i<n+1;i++)
	        {
	            for(int j=0;j<sum+1;j++)
	            {
	                if(i==0&& j!=0)
	                {
	                    t[i][j]=false;
	                }
	                else if(j==0)
	                {
	                    t[i][j]=true;
	                }

	                else if(a[i-1]<=j){
	                        t[i][j]= t[i-1][j-a[i-1]] || t[i-1][j] ;

	                        }
	                    else {
	                        t[i][j]=t[i-1][j];
	                    }
	                System.out.print(t[i][j]+",");
	            }
	            System.out.println("");
	        }
	        int ans=0;
	        int j=sum;
	        int i=n;
	        while(j>0)
	        {
	            if(t[i][j]==true)
	            {	System.out.println(j);
	                ans=j;
	                break;
	            }
	            j--;
	        }
	        return (sum1-ans)-j;
	        
	    }
}
