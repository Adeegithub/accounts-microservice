package com.eazybank.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Accounts extends BaseEntity{
    @Column(name = "customer_id")
    private long customerId;

    @Id
    @Column(name = "account_number")
    private long accountNumber;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "branch_address")
    private String branchAddress;
}
