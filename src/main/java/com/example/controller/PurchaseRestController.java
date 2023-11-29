package com.example.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PurchaseDAO;
import com.example.domain.PurchaseVO;
import com.example.service.PurchaseService;

@RestController
@RequestMapping("/purchase")
public class PurchaseRestController {
	@Autowired
	PurchaseDAO dao;
	
	@Autowired
	PurchaseService service;
	
	@PostMapping("/insert")
	public String insert(@RequestBody PurchaseVO vo) {
		String oid=UUID.randomUUID().toString().substring(0, 20);
		vo.setOid(oid);
		
		service.insertPurchase(vo);
		return oid;
	}
}
