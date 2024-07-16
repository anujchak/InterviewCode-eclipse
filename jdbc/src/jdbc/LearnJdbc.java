package jdbc;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
public class LearnJdbc{

	public static void main(String[] args) {
		
		try {
			//load  the Driver
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection conn = null;
			 //String url="jdbc:mysql://localhost3306/coffee";
			 String url ="jdbc:mysql://localhost:3306/student";
			 String userName="root";
			 String password="Anuj@1998";
	            conn = DriverManager.getConnection(url,userName,password);
	            if(conn.isClosed()){
	            	System.out.println("connection is still closed");
	            }
	            else {
	            	System.out.println("connection established");
	            }
	            String q="select * from boys";
	            Statement stmt= conn.createStatement();
	            ResultSet set = stmt.executeQuery(q);
	            int i =0;
	            while(set.next())
	            {
	            	int id =set.getInt("id");
	            	String s = set.getString("name");
	            	System.out.println(id+"     "+s+ i);
	            	i++;
	            }
	            String q1="create table girls( id INT,name varchar(30));";
	            try {
	            stmt.executeUpdate(q1);
	            }
	            catch(Exception e){
	            	System.out.println("quary faild");
	            	
	            }
	            System.out.println("conti");
	            /*
	            String q2="insert into girls(id,name)values(?,?);";
	            PreparedStatement psmt = conn.prepareStatement(q2);
	            psmt.setString(1,"3");
	            psmt.setString(2,"Anujusree");
	            Scanner sc = new Scanner(System.in);
	            System.out.println("input your name");
	            String s=sc.nextLine();
	            System.out.println("input your roll no");
	            String n =sc.nextLine();
	            String q3="insert into girls(id,name)values(?,?);";
	            PreparedStatement psmt1 = conn.prepareStatement(q3);
	            psmt1.setString(1,n);
	            psmt1.setString(2,s);
	            try {
	            psmt.executeUpdate();
	            }catch(Exception e) {
	            	System.out.println("quary faild girls hard coded one");
	            	e.printStackTrace();
	            }
	            try {
		            psmt1.executeUpdate();
		            }catch(Exception e) {
		            	System.out.println("quary faild girls user input");
		            	e.printStackTrace();
		            }*/
	          //conn.close();
	            String q4="insert into images(pics) values(?);";
	            FileInputStream fis = new FileInputStream("G:\\pics\\anuj pic.jpg");
	            PreparedStatement psmt = conn.prepareStatement(q4);
	            psmt.setBinaryStream(1,fis, fis.available());
	            try {
	            psmt.executeUpdate();
	            }catch (Exception e){
	            	System.out.println("image quary  faild");
	    			e.printStackTrace();
	            }
		}catch(Exception e){
			System.out.println("connection faild");
			e.printStackTrace();
		}
		
	}

}
