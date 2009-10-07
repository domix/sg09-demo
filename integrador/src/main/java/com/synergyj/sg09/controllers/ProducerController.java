package com.synergyj.sg09.controllers;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producer")
public class ProducerController {
	@Autowired
	ProducerTemplate producerTemplate;
	
	
	@RequestMapping("/produce/{header}/{content}")
	public String produce(@PathVariable String content, @PathVariable String header, Model model) {
		
		producerTemplate.sendBodyAndHeader("jms:Topic.des", content, "header", header);
		model.addAttribute("encabezado", header);
		model.addAttribute("content", content);
		
		return "produce";
	}
}
