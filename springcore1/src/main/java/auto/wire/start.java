package auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class start {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("auto/wire/config1.xml");
        Student s =(Student)context.getBean("student");
        System.out.println(s);

	}

}
