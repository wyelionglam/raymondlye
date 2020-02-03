package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subscription implements Serializable{

	private static final long serialVersionUID = -6752774452769553253L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "id")
	private Integer id;

	@Column(name= "amount")
	private Integer amount;
	
	@Column(name = "subscription_type")
	private String subscriptionType;
	
	@Column(name = "day_or_date")
	private String dayOrDate;
	
	@Column(name = "start_date")	
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
