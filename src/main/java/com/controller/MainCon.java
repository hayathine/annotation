package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@Controller
@SpringBootApplication
public class MainCon{
	// ホーム画面
	@RequestMapping("/")
	String home() {
		return "Hello World";
	}
	
	//フォーム入力画面
	@RequestMapping("form")
	public String showForm(PersonForm personForm) {
		return "form";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MainCon.class, args);
	}
}