package com.study.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.provider.model.ProviderInfo;
import com.study.provider.repository.InfoRepository;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;
    
    public ProviderInfo getInfoByState(String state) {
	return infoRepository.findByState(state);
    }

}
