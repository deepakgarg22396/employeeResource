package com.paypal.bfs.test.employeeserv.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@NoArgsConstructor
public class Address {

    @JsonProperty("line1")
    private String line1;
    @JsonProperty("line2")
    private Optional<String> line2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("zip_code")
    private int zip_code;
}
