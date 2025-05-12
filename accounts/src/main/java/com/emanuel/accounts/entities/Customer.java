package com.emanuel.accounts.entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    private String name;

    private String email;

    @Column(name = "mobile_number")
    private Long mobileNumber;

}
