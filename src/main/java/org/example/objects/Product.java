package org.example.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Product{

    @JsonProperty("hardwareProducts")
    private List<HardwareProducts> hardwareProducts;
    @JsonProperty("sourceresources")
    private String sourceresource;
    @JsonProperty("promotionType")
    private String promotionType;
    @JsonProperty("isActive")
    private String isActive;
    @JsonProperty("excludedProducts")
    private List<ExcludedProducts> excludedProducts;
    @JsonProperty("channel")
    private String channel;


    public List<HardwareProducts> getHardwareProducts() {
        return hardwareProducts;
    }

    public void setHardwareProducts(List<HardwareProducts> hardwareProducts) {
        this.hardwareProducts = hardwareProducts;
    }

    public String getSourceresource() {
        return sourceresource;
    }

    public void setSourceresource(String sourceresource) {
        this.sourceresource = sourceresource;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public List<ExcludedProducts> getExcludedProducts() {
        return excludedProducts;
    }

    public void setExcludedProducts(List<ExcludedProducts> excludedProducts) {
        this.excludedProducts = excludedProducts;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Product(List<HardwareProducts> hardwareProducts, String sourceresource, String promotionType, String isActive, List<ExcludedProducts> excludedProducts, String channel) {
        this.hardwareProducts = hardwareProducts;
        this.sourceresource = sourceresource;
        this.promotionType = promotionType;
        this.isActive = isActive;
        this.excludedProducts = excludedProducts;
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Product{" +
                "hardwareProducts=" + hardwareProducts +
                ", sourceresource='" + sourceresource + '\'' +
                ", promotionType='" + promotionType + '\'' +
                ", isActive='" + isActive + '\'' +
                ", excludedProducts=" + excludedProducts +
                ", channel='" + channel + '\'' +
                '}';
    }
}
