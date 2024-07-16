package array;

import java.util.Date;

 final public class employeee {


final int roll;
final Date d;
final String dept;

public String getDept() {
	return dept;
}
public employeee(int roll, Date d, String dept) {
	super();
	this.roll = roll;
	this.d = d;
	this.dept = dept;
}
@Override
public String toString() {
	return "employeee [roll=" + roll + ", d=" + d + ", dept=" + dept + "]";
}
public int getRoll() {
	return roll;
}

public Date getD() {
	return (Date) d.clone();
}

}
