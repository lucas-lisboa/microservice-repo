package com.study.store.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.store.dto.PurchaseDTO;
import com.study.store.model.Purchase;
import com.study.store.service.PurchaseService;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    private static final Logger LOG = LoggerFactory.getLogger(PurchaseController.class);
    @Autowired
    private PurchaseService purchaseService;

    @RequestMapping(method = RequestMethod.POST)
    public Purchase makePurchase(@RequestBody PurchaseDTO purchase) {
	LOG.info("received purchase order");
	return purchaseService.makePurchase(purchase);
    }
}
