package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SubscriptionService;
import com.example.demo.vo.SubscriptionVo;

@RestController
@CrossOrigin(origins = "*", maxAge=3600)
@RequestMapping("/ezypay")
public class subscriptionController {
	
	@Autowired
	private SubscriptionService svc;

	@PostMapping(value="/api/subscription")
	public ResponseEntity<Integer> createSubscription(@RequestBody SubscriptionVo subVo){
		int data = svc.createSubscription(subVo);
		HttpHeaders responseHdrs = new HttpHeaders();
		responseHdrs.set("Content-Type", "application/json");
		return new ResponseEntity<Integer>(data, responseHdrs, HttpStatus.OK);
	}
}
