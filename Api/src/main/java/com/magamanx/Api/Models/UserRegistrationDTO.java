package com.magamanx.Api.Models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserRegistrationDTO(
    @NotBlank
    String username,
    @NotBlank
    @Pattern(regexp = "\\d{8}")
    String password,
    @NotBlank
    @Email
    String email) {

}
