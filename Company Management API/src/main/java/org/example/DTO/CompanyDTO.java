package org.example.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

@Validated
public class CompanyDTO {

    @NotNull(message = "id should not be null")
    private Long id;

    @NotNull(message = "name should not be null")
    private String name;

    @Email(message = "email should be valid", regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
    private String email;

    @Min(value = 1, message = "employeeCount should be greater than 0")
    private Integer employeeCount;
    private LocalDateTime createdAt;
}
