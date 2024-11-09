package com.eazybank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data //@Data will create both Getter and Setter Methods.
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account Information"
)
public class CustomerDto {
    @NotEmpty(message = "Name Cannot be Null or Empty")
    @Size(min = 5, max = 50, message = "The length of the name should be in between 5 and 50")
    @Schema(
            description = "Name of the Customer",
            example = "Adeesha Arunoda"
    )
    private String name;

    @NotEmpty(message = "Email cannot be Null or Empty")
    @Email(message = "Email address should be a valid email")
    @Schema(
            description = "Email Address of the Customer",
            example = "adeesha.ag@gmail,com"
    )
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})",message = "Please enter a valid Mobile Number")
    @Schema(
            description = "Mobile Number of the Customer",
            example = "0771234567"
    )
    private String mobileNumber;

    @Schema(
            description = "Account Details of the Customer"
    )
    private AccountsDto accountsDto;
}
