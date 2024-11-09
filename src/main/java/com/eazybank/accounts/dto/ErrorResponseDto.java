package com.eazybank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(
        name = "Error Response",
        description = "Schema to hold Error Response Information"
)
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by client"
    )
    private String apiPath;

    @Schema(
            description = "Error Code Representing the error happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error Message Representing the error happened"
    )
    private String errorMessage;

    @Schema(
            description = "Timestamp of the the Error Response"
    )
    private LocalDateTime errorTime;

}
