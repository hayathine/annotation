package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.PersonForm;

import org.springframework.ui.Model;
//ホーム画面、フォーム画面を表示するHTMLに遷移する
@Controller
@SpringBootApplication
public class FrontController{
	// ホーム画面
	@RequestMapping("/")
	String shoeHome() {
		return "home";
	}
	
	//フォーム入力画面への遷移
	@RequestMapping("form")
	public String showForm(PersonForm personForm) {
		return "form";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FrontController.class, args);
	}
}
