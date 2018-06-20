package com.tongtong.hibernate.service.impl;

import org.springframework.stereotype.Service;
import com.tongtong.hibernate.service.TestService;;

@Service
public class TestServiceImpl implements TestService {
	public String test(){
		return "test";
	}
}
