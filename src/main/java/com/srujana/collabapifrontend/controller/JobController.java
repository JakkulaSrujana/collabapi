package com.srujana.collabapifrontend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srujana.collabapibackend.model.Job;

@RestController
public class JobController {

	public JobController()
	{
		System.out.println("In Job Controller");
	}
	@RequestMapping("/getJobs")
	public List<Job> getGobs()
	{
		Job j1=new Job();
		Job j2=new Job();
		j1.setJob_Role("Software Devloper");
		j1.setJob_Description("FullStackDeveloping");
		j1.setSalary("45000");
		j2.setJob_Role("UIDeveloper");
		j2.setJob_Description("FrontEndDeveloping");
		j2.setSalary("35000");
		
		List<Job> joList=new ArrayList<Job>();
		joList.add(j1);
		joList.add(j2);
		return joList;
	}
	
}
