package com.srujana.collabapi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@EnableWebMvc
@ComponentScan(basePackages="com.srujana")
public class AppConfig extends WebMvcConfigurerAdapter
{

}
