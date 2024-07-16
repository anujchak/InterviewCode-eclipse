package auto.wire;
public class Addres {
private String state;
private String city;
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Addres(String state, String city) {
	super();
	this.state = state;
	this.city = city;
}
@Override
public String toString() {
	return "Addres [state=" + state + ", city=" + city + "]";
}
public Addres() {
	super();
	// TODO Auto-generated constructor stub
}
}
