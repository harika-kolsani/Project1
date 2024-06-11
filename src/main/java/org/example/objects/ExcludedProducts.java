package org.example.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExcludedProducts {
    @JsonProperty("clothes")
    private String clothes;
    @JsonProperty("fashion")
    private String fashion;

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getFashion() {
        return fashion;
    }

    public void setFashion(String fashion) {
        this.fashion = fashion;
    }

    public ExcludedProducts(String clothes, String fashion) {
        this.clothes = clothes;
        this.fashion = fashion;
    }

    @Override
    public String toString() {
        return "ExcludedProducts{" +
                "clothes='" + clothes + '\'' +
                ", fashion='" + fashion + '\'' +
                '}';
    }
}
