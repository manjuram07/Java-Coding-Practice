package org.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Data
@Entity
public class Company {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private Integer employeeCount;
    private LocalDateTime createdAt;

}
