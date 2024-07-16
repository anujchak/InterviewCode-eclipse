package form.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
		public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
		{	Cookie c1[] = request.getCookies();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			System.out.println(c1);
			if(true) {
			
			String name = request.getParameter("user_name");
			String password = request.getParameter("user_password");
			String email = request.getParameter("user_email");
			String gender = request.getParameter("user_gender");
			String course = request.getParameter("user_course");
			String t = request.getParameter("terms");
			String q = request.getParameter("uname");
			out.println("<h2>Name:"+name);
			out.println("<h2>Password:"+password);
			out.println("<h2>email:"+email);
			out.println("<h2>Gender:"+gender);
			out.println("<h2>Course:"+course);
			out.println("<h2>t:"+t);
			out.println("<h2>q:"+q);
			
		     // hiddne form fild
			//out.println(""
					//+ "<input type='hidden' name='uname' value='\"+name\"'>"
					//+ "");
			InsertIntoDb.insert(name,gender,password,email,course);
			Cookie c = new Cookie("user_name",name);
			response.addCookie(c);
			out.println("<form action=\"ShowTable.jsp\" method=\"post\">");
			out.println("<button type=\"submit\">Submit</button>");
			out.println("</form>");
			
			}
			else {
				String name="no name";
				for(Cookie c2:c1)
				{
					String s = c2.getName();
					if(s.equals("user_name"))
					{
						name=c2.getValue();
					}
				}
				out.println("<h2>Hi"+name+"<h2>you already registed your self");
			}
			
		}
}