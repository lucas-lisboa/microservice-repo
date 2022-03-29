package com.study.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.store.client.ProviderClient;
import com.study.store.dto.PurchaseDTO;

@Service
public class PurchaseService {

    @Autowired
    private ProviderClient client;

    public void makePurchase(PurchaseDTO purchase) {
	System.out.println(client.getInfoByState(purchase.getAddress().getState()).getAddress());
    }

}
