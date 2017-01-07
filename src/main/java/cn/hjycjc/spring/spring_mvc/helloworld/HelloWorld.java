package cn.hjycjc.spring.spring_mvc.helloworld;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {
	
	@RequestMapping("/helloworld")
	public String hello(){
//		测试
		System.out.println("Hello World!");
//		解析器
/*		前缀<property name="prefix" value="/WEB-INF/views/"></property>
		后缀<property name="suffix" value=".jsp"></property>*/
		
		return "success";
	}
	
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testRequestMapper(){
		return "success";
	}
	
	@RequestMapping(value="/testParamsHeader",method=RequestMethod.GET,params={"username","age!=10"})
	public String testParamsHeader(){
		System.out.println("testParamsHeader:");
		return "success";
	}
	
	@RequestMapping(value="test/*/api")
	public String testREST(){
		System.out.println("testREST:");
		return "success";
	}
	
	@RequestMapping("testPathVariable/{restid}")
	public String testPathVariable(@PathVariable(value="restid") Integer id){
		System.out.println("testPathVariable:"+id);
		
		return "success";

	}
}
