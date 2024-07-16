package springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class start2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springorm/springorm.xml");
		student s = new student("balrav","xxx","c","balrav@gmail.com");
		studentDao dao=(studentDao)context.getBean("studentDao");
		String i =dao.insert(s);
		System.out.println(i);
		

	}

}
