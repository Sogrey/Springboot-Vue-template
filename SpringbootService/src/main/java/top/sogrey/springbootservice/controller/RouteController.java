package top.sogrey.springbootservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // ��������һ��SpringMVC��Controller������
@RequestMapping(value = "/api")
public class RouteController {
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "hello world";
	}

	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello(String name) {
		return "hello " + name;
	}
}
