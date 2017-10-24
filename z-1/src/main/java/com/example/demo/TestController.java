package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.DiscoveryClient;

@Controller
public class TestController {
	 
    private DiscoveryClient discoveryClient;
	@GetMapping("/")
	@ResponseBody
	public String ho() {
		System.out.print("测试啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦");
		return "我是z1";
	}
}
