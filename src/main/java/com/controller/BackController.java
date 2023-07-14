package com.controller;

import java.io.Reader;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.data.PersonForm;

import jakarta.servlet.http.HttpServletRequest;

//1．requestデータに対して先頭に「名前」を付けてresponseを返す。
//2.  requestデータに対してCRUD操作。
@RestController
@SpringBootApplication
public class BackController {
//RESTCONTROLLREを使ってフォーム画面から入力されたデータを処理する。
	//フォームで入力されたデータを受け取る
	@RequestMapping(value="/form", method =  RequestMethod.POST)
//1．requestデータに対して先頭に「名前」を付けてresponseを返す。
	public String addName(HttpServletRequest request) throws Exception{
		
		// TODO 認証機能
		
		// TODO validate
		
		//リクエストパラメータを受け取る クーポンバンクではReaderを使っているが今回はgetPatameterを使う
		String name = PersonForm.class.getName();
		name = request.getParameter("name");
		
//		int len =re.read();
		//TODO　一文字ずつ読み込むための処理
//		while ((len =re.read()) > 0) {
//		}
		//文字コードからchar型、char型からString型へ変換
//		name = String.valueOf((char) len);

		return "あなたの名前" + name;
	}
}
