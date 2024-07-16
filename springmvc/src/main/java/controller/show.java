package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class show {
@Autowired
private userService s;
	@RequestMapping("/form")
public static String view()
{
	return "contact";
}
	/*
@RequestMapping(path="/collector",method=RequestMethod.POST)
public  String collect(@RequestParam("email")String user_mail,
		@RequestParam("user_name")String user_name,
		@RequestParam("user_password")String user_password,Model model)
{
	System.out.println("in collector");
	//model.addAttribute("email",user_mail);
	//model.addAttribute("user_name",user_name);
	//model.addAttribute("user_password",user_password);
	user u=new user();
	u.setEmail(user_mail);
	u.setUser_name(user_name);
	u.setUser_password(user_password);
	model.addAttribute("user",u);
	return "result";
}
*/
	// useing model attribute
	@RequestMapping(path="/collector",method=RequestMethod.POST)
	public  String collect(@ModelAttribute users u,Model model)
	{
		int n=this.s.createUser(u);
		model.addAttribute("msg","user created with Roll"+n);
		return "result";
	}
}
