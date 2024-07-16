package form.com;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class InsertIntoDb {
	
	public static void insert(String user_name,String gender,String password1,String email,String course )
	{
			
			try {
				//load  the Driver
				 Class.forName("com.mysql.cj.jdbc.Driver");
				 Connection conn = null;
				 String url ="jdbc:mysql://localhost:3306/student1";
				 String userName="root";
				 String password="Anuj@1998";
		            conn = DriverManager.getConnection(url,userName,password);
		            if(conn.isClosed()){
		            	System.out.println("connection is still closed");
		            }
		            else {
		            	System.out.println("connection established");
		            }
		            
		            String q3;
		            String s="female";
		            if(gender.equals(s))
		            {	System.out.println("in girls"+gender);
		             q3="insert into girls(name,password,course,email)values(?,?,?,?);";
		            }
		            else
		            {	System.out.println("in boys"+gender);
		            	 q3="insert into boys(name,password,course,email)values(?,?,?,?);";
		            }
		            PreparedStatement psmt1 = conn.prepareStatement(q3);
		            psmt1.setString(1,user_name);
		            psmt1.setString(2,password1);
		            psmt1.setString(3,course);
		            psmt1.setString(4,email);
		            
		            
		            
		            try {
			            psmt1.executeUpdate();
			            }catch(Exception e) {
			            	System.out.println("quary faild girls user input");
			            	e.printStackTrace();
			            }
		            
		            
		          
			
		

	}catch(Exception e) {
            	e.printStackTrace();
            	System.out.println("connection faild");
            }
      

	
	}
}
