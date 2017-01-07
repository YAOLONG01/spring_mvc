package cn.hjycjc.spring.spring_mvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hjycjc.spring.spring_mvc.entity.User;

@Controller
public class TestPojo {
	@RequestMapping(value="test/pojo")
	public String testPojo(User user){
		System.out.println("user:"+user);
		return "success";

	}

}
