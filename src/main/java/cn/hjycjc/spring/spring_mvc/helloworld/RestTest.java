package cn.hjycjc.spring.spring_mvc.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestTest {
	@RequestMapping(value="test/delete/{id}",method=RequestMethod.DELETE)
	public String testDelete(@PathVariable(value="id") Integer id){
		System.out.println("testDelete:"+id);
		return "success";
	}
	
	/*
	 * @RequestParam
	 */
	@RequestMapping(value="test/requestParam",method=RequestMethod.GET,params={"username"})
	public String testParamsHeader(@RequestParam(value="username") String un,
			@RequestParam(value="age",required=false,defaultValue="10") Integer age){
		System.out.println("test/requestParam:"+"username"+un+"age"+age);
		return "success";
	}
	/*
	 * @属性同上
	 */
	@RequestMapping("test/requestHeader")
	public String testHeader(@RequestHeader(value="Accept-Language") String al){
		System.out.println("test/requestHeader:"+al);
		return "success";
	}
	/*
	 * 属性同上
	 */
	
	@RequestMapping("test/requestcv")
	public String testCookiesValue(@CookieValue(value="JSESSIONID") String cv){
		System.out.println("test/requestcv:::JSESSIONID:"+cv);
		return "success";
	}
	
}
