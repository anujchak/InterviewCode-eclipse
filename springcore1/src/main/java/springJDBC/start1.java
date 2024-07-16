package springJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import auto.wire.Student;

public class start1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context=new ClassPathXmlApplicationContext("springJDBC/springjdbc.xml");
		 JdbcTemplate con =(JdbcTemplate)context.getBean("jdbctemplate",JdbcTemplate.class);
		//String q3="insert into girls(name,password,course,email)values(?,?,?,?);";
		//int update = con.update(q3,"raja","sss","python","@mail");
		//System.out.println(update);
		//for multiple row fatching
		/*String q="select * from boys;";
		RowMapper<student2> rowmapper =new rowmapperImpal();
		List<student2> l=con.query(q,rowmapper);
		for(student2 i : l)
		{
			System.out.println(i);
		}*/
		 //for single row fatching
		 String q1="select * from boys where roll=?;";
		 RowMapper<student2> rowmapper =new rowmapperImpal();
		 student2 l=con.queryForObject(q1,rowmapper,1 );
		 System.out.println(l);
	}

}
