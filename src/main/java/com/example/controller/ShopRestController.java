package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ShopDAO;
import com.example.domain.QueryVO;
import com.example.domain.ShopVO;
import com.example.service.ShopService;
import java.util.*;

@RestController
@RequestMapping("/shop")
public class ShopRestController {
	@Autowired
	ShopDAO dao;
	
	@Autowired
	ShopService service;
	
	@PostMapping("/insert")
	public void insert(@RequestBody ShopVO vo) {
		service.insert(vo);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody ShopVO vo) {
		System.out.println(vo.toString());
		dao.update(vo);
	}
	
	@GetMapping("/list.json")
	public HashMap<String,Object> list(QueryVO vo){
		return service.list(vo);
	}
	
	@GetMapping("/delete")
	public void delete(int pid) {
		dao.delete(pid);
	}
	
	@GetMapping("/read/{pid}")
	public HashMap<String,Object> read(@PathVariable int pid){
		return dao.read(pid);
	}
}
