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
public class ReadPropertiesController6 {
	
	@GetMapping("/redirect")
	public String redirectHandler(Model model) {
		log.info("redirect to messages");
		// crea una peticion nueva, se camiba la url
		return "redirect:/messages";
	}
	
	@GetMapping("/forward")
	public String forwardHandler(Model model) {
		log.info("forward to messages");
		// mamntiente la petcion y sus valores, la url no cambia
		return "forward:/messages";
	}
}
