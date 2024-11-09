package com.eazybank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account Information"
)
public class AccountsDto {

    @Pattern(regexp ="(^$|[0-9]{10})",message = "Account Number should be 10 Digits")
    @Schema(
            description = "Account number of EazyBank Account"
    )
    private long accountNumber;


    @NotEmpty(message = "Account Type cannot be Null or Empty")
    @Schema(
            description = "Account type of EazyBank Account",
            example = "Savings"
    )
    private String accountType;


    @NotEmpty(message = "Branch address cannot be Null or Empty")
    @Schema(
            description = "Branch Address of the EazyBank Account",
            example = "Galle, Sri Lanka"
    )
    private String branchAddress;
}
