package com.tongtong.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tongtong.hibernate.service.PersonService;
import com.tongtong.hibernate.service.TestService;

/**
 * @author tongtong.ge
 * 2018-6-7 23:33:39
 */
@Controller
public class MainController {
	
	@Autowired
	private TestService testService;
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(){
		// 实际返回的是views/test.jsp
		// springmvc-servlet.xml中配置过前后缀
		return "test";
	}
	
	@RequestMapping(value="/springtest", method=RequestMethod.GET)
	public String springTest(){
		// test方法返回的是"test"字符串
		return testService.test();
	}
	
	@RequestMapping(value="/savePerson", method=RequestMethod.GET)
	@ResponseBody
	public String savePerson(){
		personService.savePerson();
		return "success";
	}
}
