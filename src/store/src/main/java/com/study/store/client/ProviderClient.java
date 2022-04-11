package com.study.store.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.store.dto.InfoProviderDTO;
import com.study.store.dto.InfoRequestDTO;
import com.study.store.dto.PurchaseItemDTO;

@FeignClient("provider")
public interface ProviderClient {

    @RequestMapping("info/{state}")
    InfoProviderDTO getInfoByState(@PathVariable String state);

    @RequestMapping(method = RequestMethod.POST, value = "/pedido")
    InfoRequestDTO placeOrder(List<PurchaseItemDTO> itens);
}
