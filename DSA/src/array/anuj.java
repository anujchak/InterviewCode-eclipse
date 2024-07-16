package array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class anuj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]={1,2,3,1};
       System.out.println(Arrays.stream(arr).boxed().distinct().collect(Collectors.toList()));

}
}
