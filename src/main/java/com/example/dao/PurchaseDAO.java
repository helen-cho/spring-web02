package com.example.dao;

import com.example.domain.OrderVO;
import com.example.domain.PurchaseVO;

public interface PurchaseDAO {
	public void insertPurchase(PurchaseVO vo);
	public void insertOrder(OrderVO vo);
}
