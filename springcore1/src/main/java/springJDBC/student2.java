package springJDBC;
public class student2{	
	private String name;
	private String password;
	private String email;
	@Override
	public String toString() {
		return "student2 [name=" + name + ", password=" + password + ", email=" + email + ", course=" + course + "]";
	}
	private String course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
