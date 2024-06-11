package org.example.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonProperty("product")
    public Product product;
}
