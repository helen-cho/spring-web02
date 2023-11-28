package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CartDAO;
import com.example.domain.UserVO;

@RestController
@RequestMapping("/cart")
public class CartRestController {
	@Autowired
	CartDAO dao;
	
	@GetMapping("/list.json")
	public HashMap<String,Object> list(UserVO vo){
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("list", dao.list(vo));
		map.put("total", dao.total(vo.getUid()));
		return map;
	}
}
