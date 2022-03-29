package com.study.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.store.dto.PurchaseDTO;
import com.study.store.service.PurchaseService;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
	
	@Autowired
	private PurchaseService purchaseService;

	@RequestMapping(method = RequestMethod.POST)
	public void makePurchase(@RequestBody PurchaseDTO purchase) {
	    purchaseService.makePurchase(purchase);
	}
}