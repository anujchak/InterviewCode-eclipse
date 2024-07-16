package learnInterface;
@interface smartphone{
	String os() default "androiad";
	int version() default 1;
}
@smartphone(os="win",version=10)
class a{
	String os="anuj";
	int version;
}

public class inheritance {

	
	public static void main(String[]args) {
		a obj1= new a();
		System.out.println(obj1.os);
	}
}
