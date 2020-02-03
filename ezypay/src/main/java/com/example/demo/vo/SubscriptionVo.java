package com.example.demo.vo;

import java.io.Serializable;
import java.util.Date;

public class SubscriptionVo implements Serializable{

	private static final long serialVersionUID = -6081508335038810637L;

	private Integer amount;
	
	private String subscriptionType;
	
	private String dayOrDate;
	
	private Date startDate;
	
	private Date endDate;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public String getDayOrDate() {
		return dayOrDate;
	}

	public void setDayOrDate(String dayOrDate) {
		this.dayOrDate = dayOrDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
