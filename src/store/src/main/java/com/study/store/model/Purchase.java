package com.study.store.model;

public class Purchase {

    private Long purchaseId;
    private Integer prepTime;
    private String deliveryAddress;

    public Long getPurchaseId() {
	return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
	this.purchaseId = purchaseId;
    }

    public Integer getPrepTime() {
	return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
	this.prepTime = prepTime;
    }

    public String getDeliveryAddress() {
	return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
	this.deliveryAddress = deliveryAddress;
    }
}
