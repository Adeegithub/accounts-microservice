package com.eazybank.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data //@Data will create both Getter and Setter Methods.
public class CustomerDto {
    @NotEmpty(message = "Name Cannot be Null or Empty")
    @Size(min = 5, max = 50, message = "The length of the name should be in between 5 and 50")
    private String name;

    @NotEmpty(message = "Email cannot be Null or Empty")
    @Email(message = "Email address should be a valid email")
    private String email;

    @Pattern(regexp = "(^$[0-9]{10})",message = "Please enter a valid Mobile Number")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
