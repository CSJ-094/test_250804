package com.lgy.item_oracle.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.item_oracle.service.itemContentService;
import com.lgy.item_oracle.service.itemService;
import com.lgy.item_oracle.service.itemWriteService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class itemController {
	itemService service;
	
	@RequestMapping("/content_view")
	public String content_view(Model model) {
		log.info("@# content_view()");
		
		service = new itemContentService();
		service.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping("/write_result")
	public String write_result(HttpServletRequest request, Model model) {
		log.info("@# write_result()");
		
		model.addAttribute("request", request);
		
		service = new itemWriteService();
		service.execute(model);
		
		return "write_result";
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
		log.info("@# write_view()");
		
		return "item_write";
	}
}
