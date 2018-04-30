package com.example.hello_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HelloTemplateApplication {
	@RequestMapping("/")
	public String home(Model model){
		model.addAttribute("author","david");
		return "index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloTemplateApplication.class, args);
	}
}
