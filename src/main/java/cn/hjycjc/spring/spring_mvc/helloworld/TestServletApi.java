package cn.hjycjc.spring.spring_mvc.helloworld;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestServletApi {
	@RequestMapping("test/servlet/api")
	public String testServletAPI(HttpServletRequest request,HttpServletResponse response){
		System.out.println("HttpServletRequest："+request.getQueryString()+"HttpServletResponse"+response);
		return "success";
	}

}
