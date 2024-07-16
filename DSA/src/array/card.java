package array;

public class card {
	public static int cards(int a[],int l,int r,int k)
	{	if(k==0)return 0;
		return Math.max(cards(a,l+1,r,k-1)+a[l], cards(a,l,r-1,k-1)+a[r]);
		
	}
	public static void main(String[] args) {
		int a[]= {98,9,7,8};
		System.out.println(cards(a,0,a.length-1,2));
	}

}
