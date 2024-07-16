package auto.wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
@Autowired
@Qualifier("addres1")
private Addres address;

public Student() {
	super();
	System.out.println("setting default address");
	// TODO Auto-generated constructor stub
}

public Addres getAddress() {
	return address;
}

public void setAddress(Addres address) {
	this.address = address;
	System.out.println("setting address");
}


@Override
public String toString() {
	return "Student [address=" + address + "]";
}

public Student(Addres address) {
	super();
	this.address = address;
	System.out.println("setting constructor");
}
}
