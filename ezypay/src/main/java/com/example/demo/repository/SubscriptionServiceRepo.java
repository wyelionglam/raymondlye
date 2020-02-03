package com.example.demo.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Subscription;

public interface SubscriptionServiceRepo extends JpaRepository<Subscription, Integer>{

	@Modifying
	@Query(value = "insert into subscription(amount, subscription_type, day_or_date, start_date, end_date) values(:amount, :subType, :dayOrDate, :startDate, :endDate)", nativeQuery=true)
	public int createSubscription(@Param("amt") Integer amount, @Param("subType") String subType, @Param("dayOrDate") String dayDate, @Param("startDate") Date start, @Param("endDate") Date end);
}
