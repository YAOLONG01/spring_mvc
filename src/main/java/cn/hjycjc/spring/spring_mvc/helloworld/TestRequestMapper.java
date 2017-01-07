package cn.hjycjc.spring.spring_mvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("requestmapper")
@Controller
public class TestRequestMapper {
	
	
	private static String SUCCESS="success";
	@RequestMapping("/test")
	public String testRequestMapper(){
		System.out.println("testRequestMapper");
		return SUCCESS;
	}
	
	public String testRM(){
		System.out.println("testRM");
		return SUCCESS;
		
	}

}
