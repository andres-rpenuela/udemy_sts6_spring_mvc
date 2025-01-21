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
public class ReadPropertiesController3 {
	
	
    @Value("#{('${messages.user.name}').toUpperCase()}") // Convierte el nombre a mayúsculas
	private String name;
    
    @Value("#{T(java.lang.Math).pow(2, 3)}") // 2 elevado a la 3
    private double powerResult;

    @Value("#{${messages.user.age} > 18 ? 'Adulto' : 'Menor'}") // Condición ternaria
    private String userCategory;

    @Value("#{ ('${messages.fruts}').split(',')[0] }")
    private String firstItemFromList;
    
    @Value("#{ '${messages.fruts}'.toUpperCase().split(',') }")
    private List<String> valuesList;
	
	@GetMapping("/messages3")
	public String showMessagesInProperties(Model model) {
		log.info("name: {}",name);
	
		model.addAttribute("name", name);
		model.addAttribute("powerResult", powerResult);
		model.addAttribute("userCategory", userCategory);
		model.addAttribute("firstItemFromList", firstItemFromList);
		model.addAttribute("valuesList", valuesList);
		
		return "messages-view3";
	}
}
