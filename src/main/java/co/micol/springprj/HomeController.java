package co.micol.springprj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	@RequestMapping("/home.do")
	public String home(Model model) {
		return "home/home";
	}
	
	@RequestMapping("/buttons.do")
	public String button(Model model) {
		return "home/bb";
	}
}
