package com.eazybank.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long customerId;

    //At column annotation is not needed unless otherwise the column name is different.
    private String name;

    //At column annotation is not needed unless otherwise the column name is different.
    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;
}
