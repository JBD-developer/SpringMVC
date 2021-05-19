package org.zerock.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	
	@RequestMapping("")
	public void basic() {
		log.info("basic....");
		
	}
	@RequestMapping(value = "/basicGet01", method= {RequestMethod.GET, RequestMethod.POST})
	public void basicGet01() {
		log.info("basicGet01 get....");
		
	}
	
	@GetMapping("/bacicGet02")
	public void basicGet02() {
		log.info("basicGet02 basic get only get....");
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		
		log.info(" " + dto);
		
		return "";
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		
		log.info("Name :" + name);
		log.info("Age  :" + age);
		
		return "ex02";
	}
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids")ArrayList<String> ids) {
		
		log.info("ids :" + ids);
		
		return "ex02List";
	}
	
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		
		log.info("ids :" + ids);
		
		return "ex02Array";
	}
	
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTO list) {
		
		log.info("list dtos :" + list);
		
		return "ex02Bean";
	}
	
	
	
}
