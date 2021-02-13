package com.paypal.bfs.test.employeeserv.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
public class Address {

    private final String line1;
    private final Optional<String> line2;
    private final String city;
    private final String state;
    private final String country;
    private final int zip_code;
}
