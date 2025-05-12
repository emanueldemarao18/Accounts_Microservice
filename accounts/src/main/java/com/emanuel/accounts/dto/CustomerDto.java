package com.emanuel.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CustomerDto {

    private String name;

    private String email;

    @Column(name = "mobile_number")
    private Long mobileNumber;
}
