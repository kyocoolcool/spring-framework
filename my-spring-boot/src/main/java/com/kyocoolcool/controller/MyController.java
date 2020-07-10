package com.kyocoolcool.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className MyController
 * @description
 * @date 2020/7/9 7:37 PM
 **/
@RestController
public class MyController {
	@RequestMapping("/hello")
	public String hi() {
		System.out.println("hello");
		return "hello";
	}
}
