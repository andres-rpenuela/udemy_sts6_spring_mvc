package com.tokioschool.spring.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tokioschool.spring.web.messages.UserMessage;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ReadPropertiesController {
	
	@Value("${messages.user.name}")
	private String name;
	@Value("${messages.user.surname}")
	private String surname;
	@Value("${messages.user.age}")
	private Integer age;
	
	@GetMapping("/messages")
	public String showMessagesInProperties(Model model) {
		UserMessage user = new UserMessage(name, surname, age);
		log.info("user: {}",user);
		
		model.addAttribute("user", user);
		return "messages-view";
	}
}
