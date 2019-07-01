package com.srujana.collabapifrontend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	public HomeController()
	{
		System.out.println("In Home Controller");
	}
	@RequestMapping("/testing")
	public String test()
	{
		return "hello";
	}
	@RequestMapping("/testing")
	public String test2()
	{
		return "hello";
	}
}
