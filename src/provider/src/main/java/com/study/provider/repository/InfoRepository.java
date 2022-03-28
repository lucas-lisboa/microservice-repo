package com.study.provider.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.study.provider.model.ProviderInfo;

@Repository
public interface InfoRepository extends CrudRepository<ProviderInfo, Long> {

    ProviderInfo findByState(String state);
}
