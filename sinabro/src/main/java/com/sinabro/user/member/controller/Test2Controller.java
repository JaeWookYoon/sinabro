package com.sinabro.user.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test2Controller {

	
	@RequestMapping(value="test2.do")
	public String getTest2() {
		return "test2";
	}
}
