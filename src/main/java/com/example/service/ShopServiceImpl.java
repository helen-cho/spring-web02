package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.ShopDAO;
import com.example.domain.ShopVO;

@Service
public class ShopServiceImpl implements ShopService{
	@Autowired
	ShopDAO dao;
	
	@Transactional
	@Override
	public void insert(ShopVO vo) {
		int result=dao.check(vo.getProductId());
		if(result==0) {
			dao.insert(vo);
		}
	}
}
