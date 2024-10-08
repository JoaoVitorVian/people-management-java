package com.challenge.crud.dto.Person;

import java.time.LocalDate;

import com.challenge.crud.dto.Establishment.EstablishmentDTO;
import com.challenge.crud.dto.Role.RoleDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
public class PersonDTO {

    private Long id;

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", message = "Invalid CPF format")
    private String cpf;

    @NotNull(message ="Birth Date cannot be null")
    private LocalDate birthDate;

    @NotNull(message ="Admission Date cannot be null")
    private LocalDate admissionDate;

    @NotNull(message ="Email cannot be null")
    @NotBlank(message = "Email cannot be blank")
    private String email;

    private EstablishmentDTO establishment;

    private RoleDTO role;
}
