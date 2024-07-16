package controller; 
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homecontroller {
@RequestMapping("/home")
public String home(Model model) {
	model.addAttribute("f","dynamic");
	List<String> l =new ArrayList<String>();
	l.add("java");
	l.add("c");
	l.add("python");
	l.add("dbms");
	l.add("ds");
	model.addAttribute("list",l);
	return "index";
}
}
