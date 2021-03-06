package com.study.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.provider.model.ProviderInfo;
import com.study.provider.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;
    
    @RequestMapping("/{state}")
    public ProviderInfo getInfoByState(@PathVariable String state) {
	return infoService.getInfoByState(state);	
    }

}
