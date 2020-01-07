package com.example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kernel.Const;

@RestController
public class TestController {
 
	@RequestMapping(value = "/test")
	public String test() {
		System.out.println("success");
		int num  = Const.TOTAL_NUM;
		num--;
		
		System.out.println("===================="+num);
		
		return num+"";
	}
}
