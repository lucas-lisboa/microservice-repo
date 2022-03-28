package com.study.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.study.store.dto.InfoProviderDTO;
import com.study.store.dto.PurchaseDTO;

@Service
public class PurchaseService {

    @Autowired
    private RestTemplate client;

//    @Autowired
//    private DiscoveryClient eurekaClient;

    public void makePurchase(PurchaseDTO purchase) {

	ResponseEntity<InfoProviderDTO> exchange = client.exchange(
		"http://provider/info/" + purchase.getAddress().getState(), HttpMethod.GET, null,
		InfoProviderDTO.class);

//	eurekaClient.getInstances("provider").stream().forEach(p -> {
//	    System.out.println(p.getHost() + ":" + p.getPort());
//	});
	System.out.println(exchange.getBody().getAddress());
    }

}
