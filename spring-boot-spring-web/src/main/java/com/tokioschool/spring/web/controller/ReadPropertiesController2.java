package com.tokioschool.spring.web.controller;

import java.util.Arrays;
import java.util.List;

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
public class ReadPropertiesController2 {
	
	@Value("${messages.fruts}")
	private String[] frutsArray;
	
	@Value("${messages.fruts}")
	private List<String> frutsList;
	
	@GetMapping("/messages2")
	public String showMessagesInProperties(Model model) {
		log.info("frutsArray: {}",Arrays.stream(frutsArray).toList());
		log.info("frutsList: {}",frutsList);
		
		model.addAttribute("frutsArray", frutsArray);
		model.addAttribute("frutsList", frutsList);
		return "messages-view2";
	}
}
