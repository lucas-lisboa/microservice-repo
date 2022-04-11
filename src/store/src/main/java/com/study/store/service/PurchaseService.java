package com.study.store.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.store.client.ProviderClient;
import com.study.store.dto.InfoProviderDTO;
import com.study.store.dto.InfoRequestDTO;
import com.study.store.dto.PurchaseDTO;
import com.study.store.model.Purchase;

@Service
public class PurchaseService {

    private static final Logger LOG = LoggerFactory.getLogger(PurchaseService.class);
    
    @Autowired
    private ProviderClient client;

    public Purchase makePurchase(PurchaseDTO purchase) {
	
	LOG.info("buscando informações do fornecedor");
	InfoProviderDTO infoProvider = client.getInfoByState(purchase.getAddress().getState());
	
	LOG.info("realizando pedido");
	InfoRequestDTO order = client.placeOrder(purchase.getItens());
	
	Purchase savePurchase = new Purchase();
	savePurchase.setPurchaseId(order.getId());
	savePurchase.setDeliveryAddress(purchase.getAddress().toString());
	savePurchase.setPrepTime(order.getPrepTime());
	return savePurchase;
    }

}
