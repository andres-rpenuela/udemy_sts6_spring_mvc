package com.tokioschool.spring.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class ReadPropertiesController5 {
	
private final  Environment environment;

    
	@GetMapping("/messages5")
	public String showMessagesInProperties(Model model) {
		log.info("evnironment read accounts: {}",environment.getProperty("messages.fruts","apple,orange"));
		
		model.addAttribute("fruts", environment.getProperty("messages.fruts","apple,orange").split(","));

		return "messages-view5";
	}
}
