package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
	@Autowired
	// 调用模板在启动Spring Boot后自动注入
	private RedisTemplate<String,String> stringRedisTemplate;
 
	@RequestMapping("/redis")
	//获取redis保存数据
	public String get(String key) {
		System.out.println("hello");
		System.out.println(key);
		
		stringRedisTemplate.opsForValue().set(key, "aaa");
		
	    return stringRedisTemplate.opsForValue().get(key);
	}
	
//	public String setAndGet(@PathVariable("key") String key,
//			@PathVariable("value") String value) {
//		try {
//			// 设置值
//			this.stringRedisTemplate.opsForValue().set(key, value);
//			// 获取值
//			System.out.println(this.stringRedisTemplate.opsForValue().get(key));
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "error";
//		}
//		return "success";
//	}
}
