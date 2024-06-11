package org.example.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HardwareProducts {
    @JsonProperty("TV")
    private String tv;
    @JsonProperty("AC")
    private String ac;

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public HardwareProducts(String tv, String ac) {
        this.tv = tv;
        this.ac = ac;
    }

    @Override
    public String toString() {
        return "HardwareProducts{" +
                "tv='" + tv + '\'' +
                ", ac='" + ac + '\'' +
                '}';
    }
}
