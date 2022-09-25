package com.gentilaj_Assignment0;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GentilajAssignment0Controller {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
