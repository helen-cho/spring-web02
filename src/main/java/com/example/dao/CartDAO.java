package com.example.dao;

import com.example.domain.UserVO;

import java.util.*;

public interface CartDAO {
	public List<HashMap<String,Object>> list(UserVO vo);
	public int total(String uid);
}
