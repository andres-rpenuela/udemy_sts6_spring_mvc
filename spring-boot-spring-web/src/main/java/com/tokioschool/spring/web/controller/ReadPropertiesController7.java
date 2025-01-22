package com.tokioschool.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class ReadPropertiesController7 {
	
	@GetMapping("/messages7")	
	public String linksThemeleafHandler(Model model) {
		log.info("links in themeleaf");
		// 
		model.addAttribute("fromName", "Andres");
		return "messages-view7";
	}
	
	@GetMapping("/messages7/{name}")	
	public String linksThemeleafWithParamHandler(@PathVariable(value="name") String name, Model model) {
		log.info("links in themeleaf with param: {}",name);
		
		model.addAttribute("fromName", "Andres");
		return "messages-view7";
	}
	
	@GetMapping("/messages7/params")	
	public String linksThemeleafParamsHandler(@RequestParam(value="name") String name, Model model) {
		log.info("links in themeleaf with param: {}",name);
		
		model.addAttribute("fromName", "Andres");
		model.addAttribute("name", name);
		return "messages-view7";
	}
	
}
