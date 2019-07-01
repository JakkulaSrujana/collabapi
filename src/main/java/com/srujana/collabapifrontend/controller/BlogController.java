package com.srujana.collabapifrontend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srujana.collabapibackend.model.Blog;

@RestController
public class BlogController {

	public BlogController()
	{
		System.out.println("Blog Controller");
	}
	@RequestMapping("/getBlog")
	public List<Blog> getAllBlogs()
	{
		Blog b1=new Blog();
		Blog b2=new Blog();
		b1.setBlogName("flipcart");
		b1.setBlogTitle("flipcart");
		b1.setBlogOwner("filpcart");
		
		b2.setBlogName("Amazon");
		b2.setBlogTitle("Amazon");
		b2.setBlogOwner("Amazon");
		
		
		List<Blog> bList=new ArrayList<Blog>();
		bList.add(b1);
		bList.add(b2);
		return bList;
		
	}
}
