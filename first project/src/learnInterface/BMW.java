package learnInterface;

public class BMW implements car {
	static int a=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW obj = new BMW() ;
		obj.start();
		obj.talk();
		System.out.println(a);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("broom");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop");
	}
	
	void talk() {
		System.out.println("hello");
	}



}
