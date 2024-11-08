package com.eazybank.accounts.dto;

import com.eazybank.accounts.entity.Accounts;
import lombok.Data;

@Data //@Data will create both Getter and Setter Methods.
public class CustomerDto {
    private String name;
    private String email;
    private String mobileNumber;
    private AccountsDto accountsDto;
}
