package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.SubscriptionServiceRepo;
import com.example.demo.vo.SubscriptionVo;

@Service
public class SubscriptionServiceImpl implements SubscriptionService{

	@Autowired
	private SubscriptionServiceRepo repo1;
	
	@Override
	public int createSubscription(SubscriptionVo subVo) {
		int result = repo1.createSubscription(subVo.getAmount(), subVo.getSubscriptionType(), subVo.getDayOrDate(), subVo.getStartDate(), subVo.getEndDate());
		return result;
	}
	
}
