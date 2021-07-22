package com.tech4me.hrpayroll.services;

import com.tech4me.hrpayroll.feignclients.WorkerFeignClient;
import com.tech4me.hrpayroll.model.Payment;
import com.tech4me.hrpayroll.model.Worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(long workerId, int days) {
				
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
