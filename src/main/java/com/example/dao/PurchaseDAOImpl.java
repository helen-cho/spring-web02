package com.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.OrderVO;
import com.example.domain.PurchaseVO;

@Repository
public class PurchaseDAOImpl implements PurchaseDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.PurchaseMapper";
	
	@Override
	public void insertPurchase(PurchaseVO vo) {
		session.insert(namespace + ".insert_purchase", vo);
	}

	@Override
	public void insertOrder(OrderVO vo) {
		session.insert(namespace + ".insert_order", vo);
	}
}
