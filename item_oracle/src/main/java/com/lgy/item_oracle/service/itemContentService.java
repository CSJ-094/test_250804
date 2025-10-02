package com.lgy.item_oracle.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.lgy.item_oracle.dao.itemDAO;
import com.lgy.item_oracle.dto.itemDTO;


public class itemContentService implements itemService{
	
	@Override
	public void execute(Model model) {
		itemDAO dao = new itemDAO();
		ArrayList<itemDTO> dtos = dao.list();
		model.addAttribute("content_view", dtos);
	}
}