package com.example.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.OrderVO;
import com.example.domain.PurchaseVO;

@RestController
@RequestMapping("/purchase")
public class PurchaseRestController {

	@PostMapping("/insert")
	public String insert(@RequestBody PurchaseVO vo) {
		String oid=UUID.randomUUID().toString().substring(0, 20);
		vo.setOid(oid);
		System.out.println(vo.toString()); //구매자정보
		
		List<OrderVO> orders=vo.getOrders();
		for(OrderVO order:orders) {
			order.setOid(oid);
			System.out.println(order.toString()); //구매상품정보
		}
		return oid;
	}
}
