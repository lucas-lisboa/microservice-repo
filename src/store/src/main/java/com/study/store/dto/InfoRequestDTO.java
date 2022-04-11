package com.study.store.dto;

public class InfoRequestDTO {
    private Long id;
    private Integer prepTime;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Integer getPrepTime() {
	return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
	this.prepTime = prepTime;
    }
}
