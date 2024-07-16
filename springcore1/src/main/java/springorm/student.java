package springorm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="human")
public class student {
	@Id
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="course")
	private String course;
	@Column(name="email")
	private String email;
public student() {
		super();
		// TODO Auto-generated constructor stub
	}
public student(String name, String password, String course, String email) {
		super();
		this.name = name;
		this.password = password;
		this.course = course;
		this.email = email;
	}
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
