package com.tokioschool.spring.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ReadPropertiesController4 {
	

    @Value("#{ ${messages.accounts} }")
    private Map<String, Object> accounts;

	
	@GetMapping("/messages4")
	public String showMessagesInProperties(Model model) {
		log.info("accounts: {}",accounts);
	
		model.addAttribute("accounts", accounts);
		
		return "messages-view4";
	}
}
