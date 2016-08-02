package com.xinguan14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@SpringBootApplication
public class TestDemo1Application {
  //进入首页
	@RequestMapping("/index")
	public  String index(Model model){
		model.addAttribute("time",new Date());
		return "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(TestDemo1Application.class, args);
	}
}
